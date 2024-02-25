package pratice;

public interface LeapYear {
	static java.util.Scanner S=new java.util.Scanner(System.in);
	public static void display() {
		System.out.println("enter the year");
		int year=S.nextInt();
		if(year%400==0||year%4==0&&year!=100) {
			System.out.println("it is a leap year "+year);
		}
		else {
			System.out.println("it is a non leap year "+year);
		}
	}
	public static void main(String[] args) {
		display();
	}
}
