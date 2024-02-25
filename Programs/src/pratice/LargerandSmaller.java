package pratice;

public class LargerandSmaller {
	static java.util.Scanner S=new java.util.Scanner(System.in);
//	public static void larger() {
//	System.out.print("enter the value a : ");
//	int a=S.nextInt();
//	System.out.println("enter the value of b : ");
//	int b=S.nextInt();
//	int larger =a;
//	if(b>larger) {
//		larger=b;
//		System.out.println("the largest number is : "+larger);
//	}
//	else {
//		System.out.println("the largest number is : "+larger);
//	}
//	System.out.println();
//	}
//	public static void smaller() {
//		System.out.print("enter the value a : ");
//		int a=S.nextInt();
//		System.out.println("enter the value of b : ");
//		int b=S.nextInt();
//		int smaller =a;
//		if(b<smaller) {
//			smaller=b;
//			System.out.println("the smallest number is : "+smaller);
//		}
//		else {
//			System.out.println("the smallest number is : "+smaller);
//		}
//		}
	public static void second() {
		System.out.println("enter the value a");
		int a=S.nextInt();
		System.out.println("enter the value of b");
		int b=S.nextInt();
		System.out.println("enter the value of c");
		int c=S.nextInt();
		int larger=a;
		int smallest=a;
		if(b>larger) {
			larger=b;
		}
		if(c>larger) {
			larger=c;
		}
		if(b<smallest) {
			smallest=b;
		}
	    if(c<smallest) {
			smallest=c;
		}
		int secondLarger=(a+b+c)-(larger+smallest);
		System.out.println("the largest is "+larger);
		System.out.println(" the secondLargest is "+secondLarger);
		System.out.println("the smallest is "+smallest);
	}
	public static void main(String[] args) {
//		larger();
//		smaller();
		second();
	}
}
