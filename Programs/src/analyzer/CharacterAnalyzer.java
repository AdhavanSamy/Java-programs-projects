package analyzer;

public class CharacterAnalyzer
{
	public static void check(String n)
	{
		if(n== "0" ||n=="1" || n=="2" || n=="3" || n=="4" || n=="5" || n=="6" || n=="7" || n=="8" || n=="9" )
		{
			System.out.println(n+" is a digit");
		}
		else if(n=="a" || n=="e" || n=="i" || n=="o" || n=="u" )
		{
			
				System.out.println(n+" is a lower case Vowel Alphabet");
		}
		else if(n!="a" || n!="e" || n!="i" || n!="o" || n!="u" )
		{
			
				System.out.println(n+" is a lower case Consonant Alphabet");
		}
		else if(n=="A" || n=="E" || n=="I" || n=="O" || n=="U" )
		{
			
				System.out.println(n+" is a Upper case Vowel Alphabet");
		}
		else if(n!="A" || n!="E" || n!="I" || n!="O" || n!="U" )
		{
			
				System.out.println(n+" is a Upper case Consonant Alphabet");
		}
	
		else
		{
			System.out.println(n+" is a symbol");
		}
	}
}
