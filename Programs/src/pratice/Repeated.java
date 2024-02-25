package pratice;

public class Repeated {
	public static void display() {
		String str="my name is vairavarishi";
		int count =0;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a') {
				count++;
			}
		}
		System.out.println("number of 'a' present in the given string is "+count);
	}
	public static void main(String[] args) {
		display();
	}
}
