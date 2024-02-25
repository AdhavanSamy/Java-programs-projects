package analyzer;

import java.util.Scanner;

public class MainOfAnalyzer 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the character");
		String num=scn.next();
		CharacterAnalyzer.check(num);;
	}
}
