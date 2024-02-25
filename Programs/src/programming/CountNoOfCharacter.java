package programming;

public class CountNoOfCharacter {
	public static void count() {
		String s="J.P.Q.Spiders.143@gmail.com";
		char[] c=s.toCharArray();
		int countV=0;int countC=0;int countS=0;int countD=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U') {
				countV++;
			}
			else if(c[i]>='0'&&c[i]<='9') {
				countD++;
			}
			else if((c[i]>='a'&&c[i]<='z')||(c[i]>='A'&&c[i]<='Z')&&(c[i]!='a'||c[i]!='e'||c[i]!='i'||c[i]!='o'||c[i]!='u'||c[i]!='A'||c[i]!='E'||c[i]!='I'||c[i]!='O'||c[i]!='U')) {
				countC++;
			}
			else {
				countS++;
			}
		}
		System.out.println("Count of Vowels "+countV);
		System.out.println();
		System.out.println("Count of Consonants "+countC);
		System.out.println();
		System.out.println("Count of Digit "+countD);
		System.out.println();
		System.out.println("Count of Symbols "+countS);
	}
	public static void main(String[] args) {
		count();
	}
}
