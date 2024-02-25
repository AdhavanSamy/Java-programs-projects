package programming;

import java.util.Iterator;

public interface DuplicateArray {
	public static void duplicateIntegerArray()
	{
		int[] a = {1,3,5,3,4,2,1};
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					count++;
				}
			}
		}
		System.out.println("Integer Array without duplicates\n");
		int[] b = new int[a.length-count];
		int numCount = 0;
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					numCount++;
				}
			}
			if(numCount==0)
			{
				b[c] = a[i];
				c++;
			}
			numCount = 0;
		}
		System.out.print("int[] b = {");
		for (int i = 0; i < b.length; i++) {
			if(i < b.length-1) {
			System.out.print(b[i]+", ");}
			else {
				System.out.print(b[i] + "}");
			}
		}
		System.out.println();
	}
	public static void duplicateCharacterArray()
	{
		char[] a = {'q','a','b','c','a','b','d'};
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					count++;
				}
			}
		}
		char[] b = new char[a.length-count];
		int numCount = 0;
		int c = 0;
		System.out.println("\nCharacter Array without duplicates\n");
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					numCount++;
				}
			}
			if(numCount==0)
			{
				b[c] = a[i];
				c++;
			}
			numCount = 0;
		}
		System.out.print("char[] b = {");
		for (int i = 0; i < b.length; i++) {
			if(i < b.length-1) {
			System.out.print(b[i]+", ");}
			else {
				System.out.print(b[i] + "}");
			}
		}
		System.out.println("\n");
	}
	public static void duplicateIntRemoval() {
		int number = 1231;
		String num = Integer.toString(number);
		int count =0 ;
		char[] a = num.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j])
				{
					count++;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		char[] b = new char[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if(a[i]>a[j])
				{
					char t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
		System.out.println();
		char[] c = new char[a.length-count];
		char[] d = new char[a.length-count];
		int cIndex = 0;
		int dIndex = 0;
		int bCount = 0;
		int aCount = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if(b[i]==b[j])
				{
					bCount++;
				}
				if(a[i]==a[j])
				{
					aCount++;
				}
			}
			if(bCount == 0)
			{
				c[cIndex]=b[i];
				cIndex++;
			}
			if(aCount == 0)
			{
				d[dIndex]=a[i];
				dIndex++;
			}
			
			bCount = 0;
			aCount = 0;
		}
		System.out.println("\n");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i]);
		}
		System.out.println("\n");
		String first = String.valueOf(c);
		int x = Integer.parseInt(first);
		System.out.println(x);
		String second = String.valueOf(d);
		int y = Integer.parseInt(second);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		duplicateIntegerArray();
		duplicateCharacterArray();
		duplicateIntRemoval();
	}
}
