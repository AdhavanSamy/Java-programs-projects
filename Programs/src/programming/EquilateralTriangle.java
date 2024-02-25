package programming;

public class EquilateralTriangle 
{
	public static void equilatrealTriangle() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void diequilateralTriangle() {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void openDiequilateralTriangle() {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("");
			}
			for(int k=1;k<=i;k++) {
				if(k==1||k==i||i==5) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void rightAngledTriangle() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" "+" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	public static void openRightAngledTriangle() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" "+" ");
			}
			for(int k=1;k<=i;k++) {
				if(k==1||k==i||i==5) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
	public static void leftAngledTriangle() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	public static void openLeftAngledTriangle() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(" "+" ");
			}
			for(int k=1;k<=i;k++) {
				if(k==1||k==i||i==5) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
    public static void square() {
    	for(int i=1;i<=5;i++) {
    		for(int j=1;j<=5;j++) {
    			System.out.print("");
    		}
    		for(int k=1;k<=5;k++) {
    			System.out.print("*"+" ");
    		}
    		System.out.println();
    	}
    }
    public static void openSquare() {
    	for(int i=1;i<=5;i++) {
    		for(int j=1;j<=5;j++) {
    			System.out.print("");
    		}
    		for(int k=1;k<=5;k++) {
    			if(k==5||k==1||i==1||i==5) {
    				System.out.print("*"+" ");
    			}
    			else {
    				System.out.print(" "+" ");
    			}
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args) {
	//	equilatrealTriangle();
	//	diequilateralTriangle();
	//	openDiequilateralTriangle();
	//	rightAngledTriangle();
	//	openRightAngledTriangle();
	//	leftAngledTriangle();
	//	openLeftAngledTriangle();
	//	square();
		openSquare();
	}
}
