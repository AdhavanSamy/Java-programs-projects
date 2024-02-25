package pratice;

public interface ThirdVariable {
	public static void withVariable() {
		int a=10;
		int b=20;
		System.out.println("before swapping a ="+a+" b="+b);
		int c=a;
		 a=b;
		 b=c;
		 System.out.println("after swapping a ="+a+" b="+b);
	}
	public static void withoutVariable() {
		System.out.println();
		int a=20;
		int b=30;
		System.out.println("before swapping a ="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping a ="+a+" b="+b);
	}
	public static void main(String[] args) {
		withVariable();
		withoutVariable();
	}
}
