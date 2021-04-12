
public class test {
	public static void main(String[] args) {
		int n= 10;
		int[] a = new int[10];
		a[0] = -5;
		for(int i =1; i<n;i++) {
			a[i] =i;
		}
		int c =0;
		for(int i =0; i <n; i++) {
			if(a[i]>=0) {
				a[c]=a[i];
				c++;
			}
		n=c;
		}
		for(int b:a) {
			System.out.println(b);
		}
	}

}
