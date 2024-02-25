package pratice;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the number");
		int num=scn.nextInt();
		if((num%2==0)&&(num>0)) {
			System.out.println(num+"it is even number");
		}
		else if(num%2!=0) {
			System.out.println(num+"it is a odd number");
		}
		else if((num==0)&&(num/2==0)&&(num%2==0)){
			System.out.println(num+"it is a neutral");
		}
	}
}
