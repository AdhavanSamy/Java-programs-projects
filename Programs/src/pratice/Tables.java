package pratice;

public class Tables {
	static java.util.Scanner S=new java.util.Scanner(System.in);
	public static void display() {
		System.out.println("enter the number");
		int num=S.nextInt();
		System.out.println();
		System.out.println("table of "+num);
		for(int i=1;i<=10;i++) {
			System.out.println(i+"*"+num+"="+(num*i));
		}
	}
	public static void main(String[] args) {
		display();
	}
}
