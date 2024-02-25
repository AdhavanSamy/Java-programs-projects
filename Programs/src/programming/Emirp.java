package programming;

public class Emirp {
	static java.util.Scanner S=new java.util.Scanner(System.in);
	public static int reverse(int num) {
		int rem;int rev=0;int n=num;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	public static boolean prime(int n) {
		int count=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void display() {
		System.out.println("enter the value");
		int num=S.nextInt();
		int rev;
		if(prime(num)) {
			rev=reverse(num);
			if(prime(rev)) {
				System.out.println("it is a emirp number");
			}
			else {
				System.out.println("it is not a emirp number ");
			}
		}
		else {
			System.out.println("it is not a prime number");
		}
	}
	public static void main(String[] args) {
		display();
	}
}
