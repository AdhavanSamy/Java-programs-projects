package pratice;

public class Power {
	static java.util.Scanner S=new java.util.Scanner(System.in);
//	public static void display() {
//		System.out.println("enter the number");
//		int num=S.nextInt();
//		System.out.println("enter the power");
//		int pow=S.nextInt();
//		int count=0;
//		long res=1;
//		while(pow!=0) {
//			res=res*num;
//			count++;
//			pow--;
//		}
//		System.out.println("the power of "+num+"^"+count+" is "+res);
//	}
	public static void forLopp() {
		System.out.println("enter the number");
		int num=S.nextInt();
		System.out.println("enter the power");
		int pow=S.nextInt();
		int count=0;
		long res=1;
		for(int i=0;i<=pow;i++) {
			res=res*num;
			count++;
		}
		System.out.println("the power of "+num+"^"+count+" is "+res);
	}
	public static void main(String[] args) {
		//display();
		forLopp();
	}
}
