package programming;

public class Insolite {
	static java.util.Scanner S=new java.util.Scanner(System.in);
	public static int square(int rem) {
		int i=rem;
		int sq=0;
		while(i>0) {
			 sq=i*i;
			i--;
		}
		return sq;
		
	}
	public static void insolite() {
		System.out.println("enter the number");
		int n=S.nextInt();
		int rem=0;
		int sum=0;
		int mul=1;
		int copy=n;
		while(n!=0) {
			rem=n%10;
			sum=sum+square(rem);
			mul=mul*square(rem);
			n=n/10;
		}
		if(copy%sum==0&&copy%mul==0) {
			System.out.println("Insolite Number");
		}
		else {
			System.out.println("Non Insolite Number");
		}
	}
	public static void main(String[] args) {
		insolite();
	}
}
