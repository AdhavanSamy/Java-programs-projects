package programming;

public class Smith {
	public static boolean prime(int n) {
		int count=0;int a=1;int num=n;
		while(num>a) {
			if(num/2%a==0) {
				count++;
			}
			a++;
		}
		if(count==1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(prime(11));
	}
}
