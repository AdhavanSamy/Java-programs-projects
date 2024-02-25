package pratice;

public class Reverse {
	static java.util.Scanner S=new java.util.Scanner(System.in);
	public static void display() {
		System.out.println("enter the number");
		int num=S.nextInt();
		int rem=0;
		int rev=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		display();
	}
}
