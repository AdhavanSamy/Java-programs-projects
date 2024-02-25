package programming;

public interface PassArray {
	public static void display(int[] array) {
		System.out.println("Elemnts of integer type array");
		System.out.println("-----------------------------");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void passingArray() {
		int[] array;
		array=new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		display(array);
	}
	public static void main(String[] args) {
		passingArray();
	}
}
