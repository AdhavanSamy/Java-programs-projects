package pratice;

public class NoLoop {
	static String s1="rishi";
	static String s2="";
	public static int display(int n) {
		if(n>=0) {
			s2=s2+s1.charAt(n);
			n--;
			display(n);
		}
		return n;
	}
	public static void main(String[] args) {
		int x=s1.length()-1;
		display(x);
		System.out.println(s2);
	}
}
