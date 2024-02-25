package pratice;

public class Days {
	static java.util.Scanner S=new java.util.Scanner(System.in);
	public static void display() {
		System.out.println("enter the totaldays");
		int totalDays=S.nextInt();
		int year=totalDays/365;
	//	totalDays=totalDays%365;
		int month=totalDays/30;
	//	int days=totalDays%30;
		System.out.println();
		System.out.println("number of years is "+year);
		System.out.println("total number of months is "+month);
		System.out.println("total number of days is "+totalDays);
	}
	public static void main(String[] args) {
		display();
	}
}
