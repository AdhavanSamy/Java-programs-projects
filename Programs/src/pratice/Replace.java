package pratice;

public class Replace {
	public static void display() {
		String s1="java";
		String s2="";
		char[] ch=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a') {
				s2=s2+'o';
			}
			else {
				s2=s2+ch[i];
			}
		}
		System.out.println(s2);
	}
	public static void main(String[] args) {
		display();
	}
}
