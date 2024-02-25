package javaConversions;

public class BinaryToDecimal {
	public static void binaryToDecimal()
	{
		String binary="1001";
		int decimal=Integer.parseInt(binary,2);
		System.out.println(decimal);
	}
	
}
