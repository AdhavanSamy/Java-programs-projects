package pratice;



public class Fibonacci {
	java.util.Scanner S=new java.util.Scanner(System.in);
	
	public static void whileLoop() {
		int a=0;
		int b=1;
		int i=1;
		System.out.print(a+" "+b+" ");
		while(i<=10) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
		System.out.println();
	}
	
	public static void forLoop() {
		int a= 0;int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=10;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	
	public static void main(String[] args) {
		whileLoop();
		forLoop();
	}
}
