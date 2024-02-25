package programming;

public class SpecialNumber {
	static java.util.Scanner S=new java.util.Scanner(System.in);
	public static void Special(int num) {
		int copy=num;
		int sum=0;
		int mul=1;
		int rem=0;
		int res=0;
		while(copy!=0) {
			rem=copy%10;
			sum=sum+rem;
			mul=mul*rem;
			copy=copy/10;
		}
		res=sum+mul;
		if(res==num) {
			System.out.println("Special Number");
		}
		else {
			System.out.println("Non Special Number");
		}
	}
	public static void main(String[] args) {
		System.out.println("enter the number");
		int num=S.nextInt();
		Special(num);
	}
}
