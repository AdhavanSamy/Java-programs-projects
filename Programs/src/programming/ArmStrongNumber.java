package programming;
	
public interface ArmStrongNumber {
	public static int count(int number)
	{
		int count = 0;
		int num = number;
		while(num>0)
		{
			count++;
			num = num/10;
		}
		return count;
	}
	public static void armStrongNumber(int number)
	{
		int root = count(number);
		int sum = 0;
		int product = 1;
		int num = number;
		int n = 0;
		while(num>0)
		{
			n = num % 10;
			for(int i = 1;i<=root;i++)
			{
				product = product * n;
			}
			sum = sum + product;
			num = num /10;
			product = 1;
		}
		if(sum == number)
		{
			System.out.println("Given number "+number+" is a ArmStrong Number");
		}
		else {
			System.out.println("Given number "+number+" is Not a ArmStrong Number");

		}
		
		
	}
	public static void armStrongNumberSeries(int number)
	{
		System.out.println("\nArmString number Series of "+ number+"\n");
		for(int i = 11;i<=number;i++)
		{
			int root = count(i);
			int sum = 0;
			int product = 1;
			int num = i;
			int n = 0;
			while(num>0)
			{
				n = num % 10;
				for(int j = 1;j<=root;j++)
				{
					product = product * n;
				}
				sum = sum + product;
				num = num /10;
				product = 1;
			}
			if(sum == i)
			{
				System.out.println(i);
			}
			sum = 0;
			product = 1;
		}
	}
	public static void main(String[] args) {
		armStrongNumber(153);
		armStrongNumberSeries(500);
	}
	
}
