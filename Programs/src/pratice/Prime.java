package pratice;

public class Prime {
	static java.util.Scanner SCANNER=new java.util.Scanner(System.in);
	
//	public static void forLoop() {
//		System.out.println("enter the number");
//		int num=SCANNER.nextInt();
//		int count=0;
//		for(int i=1;i<num;i++) {
//			if(num%i==0) {
//				count++;
//			}
//		}
//		if(count==1) {
//			System.out.println("Prime");
//		}
//		else {
//			System.out.println("non prime");
//		}
//	}
	
//	public static void whileLoop() {
//		System.out.println("enter the number");
//		int num=SCANNER.nextInt();
//		int count=0;
//		int i=1;
//		while(num>i) {
//			if(num%i==0) {
//				count++;
//			}
//			i++;
//		}
//		if(count==1) {
//			System.out.println("Prime");
//		}
//		else {
//			System.out.println("non prime");
//		}
//		
//	}

	public static void range() {
		for(int i=2;i<=100;i++) {
			int n=i;
			boolean flag=true;
			for(int j=2;j<n;j++) {
				if(n%j==0){
					flag=false;
				}
			}
			if(flag==true) {
				System.out.println("Prime"+i);
			}
			else {
				System.out.println("non prime"+i);
			}
		}
		
	}
	public static void main(String[] args) {
//		forLoop();
//		whileLoop();
		range();
	}
}
