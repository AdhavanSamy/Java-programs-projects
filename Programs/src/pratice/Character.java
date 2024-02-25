package pratice;

public class Character {
	//static java.util.Scanner S=new java.util.Scanner(System.in);
	public static void display() {
		//System.out.println("enter the alphabet");
		char ch='G';
		if(ch>='a' && ch<='z') {
			System.out.println("the given character is in lowercase "+ch);
		}
		else if(ch>='A' && ch<='Z') {
			System.out.println("the given character is in uppercase "+ch);
		}
	}
	public static void main (String[] args)
{
		display();
		}
}
