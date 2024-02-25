package pratice;

public class MissingArray {
	 public static int missing(int[] arr) {
		 int n=arr.length+1;
		 int sum=n*(n+1)/2;
		 int reSum=0;
		 for(int i=0;i<arr.length;i++) {
			 reSum=reSum+arr[i];
		 }
		 int miss=sum-reSum;
		 return miss;
	 }
	 public static void main(String[] args) {
		 int[] arr1= {1,5,7,8,9,0};
		 System.out.println("missing number in arr1 is "+missing(arr1));
		 System.out.println();
		 int[] arr2= {4,5,6,7,8};
		 System.out.println("missing number in arr2 is "+missing(arr2));
	 }
}
