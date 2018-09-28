import random

class Gene():
    
    def __init__(self, perimeter, firstGeneration):
        self.perimeter = perimeter
        if firstGeneration:
            self.randVals()
    
    def randVals(self):
        self.length = random.randint(0,self.perimeter/10)
        self.width = (self.perimeter-(2*self.length))/2
    
    def mutate(self, maxOffsetFactor):
        offset = random.randint(-self.perimeter*maxOffsetFactor,self.perimeter*maxOffsetFactor)
        self.length += offset
        self.width -= offset
    
    def area(self):
        return self.length*self.width
    
    def __str__(self):
        return str(self.length) + "*" + str(self.width) + " = " + str(self.area())

class Generation():
    
    def __init__(self, perimeter, populationSize, firstGeneration):
        self.perimeter = perimeter
        self.populationSize = populationSize
        self.population = []
        if firstGeneration:
            for i in range(self.populationSize):
                self.population.append(Gene(self.perimeter, True))
        
    def sortByArea(self):
        newPopulationTemp = []
        while len(newPopulationTemp) < self.populationSize:
            maxAreaIndex = 0
            for i in range(len(self.population)):
                if self.population[i].area() >= self.population[maxAreaIndex].area():
                    maxAreaIndex = i
            newPopulationTemp.append(self.population[maxAreaIndex])
            self.population.pop(maxAreaIndex)
        self.population = newPopulationTemp

    def getBestNMutated(self, cuttOffFactor, maxOffsetFactor):
        tempBestN = []
        for i in range(int(cuttOffFactor*len(self.population))):
            goodGene = self.population[i]
            goodGene.mutate(maxOffsetFactor)
            tempBestN.append(goodGene)
        return tempBestN

    def mutate(self, cuttOffFactor, maxOffsetFactor):
        self.sortByArea()
        newGeneration = Generation(self.perimeter, self.populationSize, False)
        bestMutated = self.getBestNMutated(cuttOffFactor, maxOffsetFactor)
        newGeneration.population.extend(bestMutated)
        while len(newGeneration.population) < self.populationSize:
            newGeneration.population.append(Gene(self.perimeter, True))
        return newGeneration

    def getBest(self):
        self.sortByArea()
        return self.population[0]

    def __str__(self):
        ret = ""
        self.sortByArea()
        for gene in self.population:
            ret += str(gene) + "\n"
        return ret

class World():

    def __init__(self, totalGenerations, populationSize, perimeter):
        self.totalGenerations = totalGenerations
        self.generation = 0
        self.populationSize = populationSize
        self.perimeter = perimeter
        self.generations = []
        self.generations.append(Generation(self.perimeter, self.populationSize, True))

    def __str__(self):
        return "Generation: "+ str(self.generation) +" Best Gene: "+ str(self.generations[self.generation].getBest()) 

    def nextGen(self, cuttOffFactor, maxOffsetFactor):
        self.generations.append(self.generations[len(self.generations)-1].mutate(cuttOffFactor, maxOffsetFactor))
        self.generation += 1

    def evolve(self, cuttOffFactor, maxOffsetFactor):
        #cuttOffFactor is what percent of the population gets mutated onto the next gen
        #maxOffSetFactor is maximum percent to mutate them by 
        while self.generation < self.totalGenerations:
            self.nextGen(cuttOffFactor, maxOffsetFactor)

world = World(1000, 10, 400)
print(world)

world.evolve(0.9, 0.01)
print(world)

