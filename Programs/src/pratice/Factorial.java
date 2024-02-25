package pratice;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scn.nextInt();
		int copy=num;
		int fact=1;
		while(num>0) {
			fact=fact*num;
			num--;
		}
		System.out.println("the factorial number of "+copy+" is = "+fact);
		}
}
