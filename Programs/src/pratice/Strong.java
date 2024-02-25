package pratice;

public class Strong {
	static java.util.Scanner S=new java.util.Scanner(System.in);
	public static void display() {
		System.out.println("enter the number");
		int num=S.nextInt();
		int sum=0;
		int copy=num;
		while(copy>0) {
			int n=copy%10;
			int fact=1;
			while(n>0) {
				fact=fact*n;
				n--;
			}
			sum=sum+fact;
			copy=copy/10;
		}
		String str=sum==num?"strong":"notstrong";
		System.out.println(str);
	}
	public static void main(String[] args) {
		display();
	}
}
