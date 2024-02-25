package test;

public class Demo {
	public static void main(String[] args) {
//		int[] arr= {5,3,2,7,8};
//		int t=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=1+i;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//				t=arr[i];
//				arr[i]=arr[j];
//				arr[j]=t;
//				}
//			}
//		}
//		System.out.print("{");
//		for(int i=0;i<arr.length;i++)
//		{
//			if(i<arr.length-1) {
//				System.out.print(arr[i]+",");
//			}
//			else {
//				System.out.print(arr[i]+"}");
//			}
//		}
		
		char[] c= {'b','s','a','c','i','d','a'};
		char y=0;
		for(int i=0;i<c.length;i++) {
			for(int j=1+i;j<c.length;j++) {
				if(c[i]>c[j]) {
				y=c[i];
				c[i]=c[j];
				c[j]=y;
				}
			}
		}
		int count=0;;
		int times=0;;
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
				}
			}
			if(count>0) 
			{
				for(int j=0;j<c.length;j++) 
				{
					if(c[i]==c[j]) 
					{
						times++;
					}
				}
				if((times-1)>count) {
					System.out.print(c[i]);
				}
			}
		}
		
	}
}
