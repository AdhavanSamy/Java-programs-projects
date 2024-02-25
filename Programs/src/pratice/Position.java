package pratice;

public class Position {
	public static void display() {
		String str="good boy";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println("character at "+i+" position "+ch[i]);
		}
	}
	public static void main(String[] args) {
		display();
	}
}
