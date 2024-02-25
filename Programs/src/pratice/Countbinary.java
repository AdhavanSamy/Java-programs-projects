package pratice;

public class Countbinary {
	static java.util.Scanner S=new java.util.Scanner(System.in);
	public static void display() {
		System.out.println("enter the number");
		int n=S.nextInt();
		int rem=0;
		int count=0;
		int copy=n;
		while(n!=0) {
			rem=n%10;
			if(rem==0||rem==1) {
				count++;
			}
			n=n/10;
		}
		System.out.println("number of binary digit's present in the given "+copy+"is ="+count);
	}
	public static void main(String[] args) {
		display();
	}
}
