package pratice;

public class SimpleInterst {
	static java.util.Scanner S=new java.util.Scanner(System.in);
	public static void display() {
		System.out.println("enter the Principle");
		double p=S.nextDouble();
		System.out.println("enter the Time Period");
		double t=S.nextDouble();
		System.out.println("enter the Rate of Interest");
		double r=S.nextDouble();
		double si=(p*t*r)/100;
		System.out.println();
		System.out.println("the simple interest is "+si);
	}
	public static void main(String[] args) {
		display();
	}
}
