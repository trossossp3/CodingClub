import random

def new_game():
    global plays, player_hand, computer_hand, pot
    player_hand = []
    computer_hand = []
    pot = []
    plays = 0
    deck = list(range(13))*4
    random.shuffle(deck)
    while len(deck) > 0:
        player_hand.append(deck.pop())
        computer_hand.append(deck.pop())       
    print (computer_hand)
    print (player_hand)

def deal():
    global pot, plays
    player_hit = player_hand.pop(0)
    computer_hit = computer_hand.pop(0)
    pot.append(player_hit)
    pot.append(computer_hit)
    plays += 1
    if player_hit > computer_hit:
        player_hand.extend(pot)
        print ("Player's cards:"), len(player_hand), ("Computer's cards:"), len(computer_hand)
        pot = []
    elif player_hit < computer_hit:
        computer_hand.extend(pot)
        print ("Player's cards:"), len(player_hand), ("Computer's cards:"), len(computer_hand)
        pot = []
    else:
        if len(player_hand) < 3:
            print ("Player is out of cards! start over!")
            print (plays, "deals")
            new_game()
        if len(computer_hand) < 3:
            print ("Dexter is out of cards! start over!")
            print (plays, "deals")
            new_game()
        for i in range(2):
            pot.append(player_hand.pop(0))
        for i in range(2):
            pot.append(computer_hand.pop(0))
        print ("It's a Tie!")
        print (pot)
    if len(player_hand) == 0:
        print ("Game over, Computer wins!!!!")
        print (plays, "deals")
        new_game()
    
    if len(computer_hand) == 0:
        print ("Game Over Player Wins!!!!")
        print (plays, "deals")
        new_game()
        
        
    
def dealer():
    while len(computer_hand) or len(player_hand) != 0:
        deal()


new_game()
dealer()

# your code goes here