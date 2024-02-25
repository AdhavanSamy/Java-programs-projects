package pratice;

public class Division {
	static java.util.Scanner S=new java.util.Scanner(System.in);
	public static void display() {
		System.out.println("enter the number");
		int num=S.nextInt();
		System.out.println("enter the divisor");
		int div=S.nextInt();
		double r=num%div;
		double q=num/div;
		System.out.println("Quotient of "+num+"%"+div+" is "+q);
		System.out.println();
		System.out.println("Remainder of "+num+"/"+div+" is "+r);
	}
	public static void main(String[] args) {
		display();
	}
}
