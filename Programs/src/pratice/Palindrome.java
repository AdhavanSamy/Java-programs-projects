package pratice;

public class Palindrome {
	static java.util.Scanner S=new java.util.Scanner(System.in);
//	public static void display() {
//		System.out.println("enter the number");
//		int num=S.nextInt();
//		int copy=num;
//		int rev=0;
//		int rem=0;
//		while(copy!=0) {
//			rem=copy%10;
//			rev=rev*10+rem;
//			copy=copy/10;
//		}
//		if(rev==num) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("non palindrome");
//		}
//	}
	public static void string() {
		String s1;
		System.out.print("enter the string :");
		s1=S.nextLine();
		String s2=" ";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2)) {
			System.out.println("palindrome :"+s2);
		}
		else {
			System.out.println("non palindrome "+s2);
		}
	}
	public static void main(String[] args) {
	//	display();
		string();
	}
}
