package nestedLoops;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 8; i++) {
			for (int j = 7; j >= i; j--) {
				System.out.print("*");
				}
			System.out.println();
		}
	}

}
