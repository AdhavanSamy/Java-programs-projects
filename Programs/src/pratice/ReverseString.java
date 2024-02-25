package pratice;

public class ReverseString {
	 static java.util.Scanner SCN=new java.util.Scanner(System.in);
//	public static void displayFor() {
//		System.out.println("enter the String");
//		String str=SCN.next();
//		char[] ch=str.toCharArray();
//		System.out.println();
//		System.out.println("reverse of the given string");
//		for(int i=ch.length-1;i>=0;i--) {
//			System.out.print(ch[i]);
//		}
//		System.out.println();
//	}
//	public static void displayWhile() {
//		System.out.println("enter the string");
//		String str=SCN.nextLine();
//		char[] ch=str.toCharArray();
//		int i=ch.length-1;
//		System.out.println();
//		System.out.println("reverse of the given string is ");
//		while(i>=0) {
//			System.out.print(ch[i]);
//			i--;
//		}
//	}
	 static String s="java";
	 static String s2=" ";
	 public static void noLoop() {
		 int x=s.length()-1;
		 condition(x);
		 System.out.println(s2);
	 }
	 public static void condition(int n) {
		 if(n>=0) {
			 s2=s2+s.charAt(n);
			 n--;
			 condition(n);
		 }
	 }
	public static void main(String[] args) {
	//	displayFor();
	//	displayWhile();
		noLoop();
	}
}
