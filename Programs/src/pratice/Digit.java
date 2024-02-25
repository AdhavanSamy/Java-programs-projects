package pratice;

public class Digit {
	static java.util.Scanner S=new java.util.Scanner(System.in);
	public static void noOdDigit() {
		System.out.println("enter the number");
		int num=S.nextInt();
		int sum=0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			sum=rem+sum;
			num=num/10;
		}
		System.out.println("sum of the number is :"+sum);
	}
	public static void main(String[] args) {
		noOdDigit();
	}
}
