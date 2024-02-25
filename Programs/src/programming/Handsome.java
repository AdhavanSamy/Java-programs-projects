package programming;

public class Handsome {
	static java.util.Scanner S=new java.util.Scanner(System.in);
	public static void display() {
		System.out.println("enter the number");
		int n=S.nextInt();
		int rem=0;
		int sum=0;
		int count=0;
		int last=n%10;
		while(n>0) {
			rem=n%10;
			if(count>0) {
				sum+=rem;
			}
			count++;
			n=n/10;
		}
		if(sum==last) {
			System.out.println("handsome");
		}
		else {
			System.out.println("not handsome");
		}
	}
	public static void main(String[] args) {
		display();
	}
}
