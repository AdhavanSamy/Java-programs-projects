package programming;

public interface ArithmeticOperation {
	public static int[] addition(int[] a,int[] b) {
		int []c=new int[a.length];
		for(int i=0;i<c.length;i++) {
			c[i]=a[i]+b[i];
		}
		return c;
	}
	public static void excution() {
		int [] a;
		a= new int[5];
		a[0]=1;a[1]=2;a[2]=4;a[3]=4;a[4]=5;
		display(a);
		int [] b;
		b= new int[5];
		b[0]=6;b[1]=7;b[2]=8;b[3]=9;b[4]=10;
		display(b);
		int[] c=addition(a, b);
		display(c);
	}
	public static void display(int[] array) {
		System.out.println("Elements of integer type array");
		System.out.println("------------------------------");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		excution();
	}
}
