package programming;

public class Beautiful {
	static java.util.Scanner S=new java.util.Scanner(System.in);
	public static void display() {
		System.out.println("enter the number");
		int n=S.nextInt();
		int rem=0;int countO=0;int countE=0;int copy=n;
		while(n>0) {
			rem=n%10;
			if(rem!=0) {
				 if(rem%2!=0) {
						countO++;
					}
					else if(rem%2==0) {
						countE++;
					}
			}
			n=n/10;
		}
		System.out.println(countO);
		System.out.println(countE);
		if(countE==countO) {
			System.out.println("Beautiful");
		}
		else {
			System.out.println("Not Beautiful");
		}
	}
	public static void main(String[] args) {
		display();
	}
}
