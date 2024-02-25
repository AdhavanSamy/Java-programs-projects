package programming;

public class Adam {
	static java.util.Scanner S=new java.util.Scanner(System.in);
	public static void display() {
		System.out.println("enter the number");
		int n=S.nextInt();
		int rev=reverse(n);int sq=square(n);int revSq=square(rev);
		int sqRev=reverse(sq);int revSqRev=reverse(sqRev);
		if((revSq==sqRev)&&(revSqRev==sq)) {
			System.out.println("adam");
		}
		else {
			System.out.println("Non adam");
		}
	}
	public static int square(int copy) {
		int n=copy*copy;
		return n;
	}
	public static int reverse(int copy) {
		int num=copy;
		int rev=0;int rem=0;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
public static void main(String[] args) {
		display();
	}
}
