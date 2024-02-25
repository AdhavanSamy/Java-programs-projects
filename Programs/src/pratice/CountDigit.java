package pratice;

public class CountDigit {
	static java.util.Scanner S=new java.util.Scanner(System.in);
	public static void display() {
		System.out.println("enter the number");
		int num=S.nextInt();
		int count=0;
		int rem=0;
		int copy=num;
		while(num!=0) {
			rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println("there are "+count+" digit int the given number "+copy);
	}
	public static void main(String[] args) {
		display();
	}
}
