package assignment1;

public class Subtract {
	private int subtract1(int a, int b) {
		return (a - b);
	}

	private int subtract1(int a, int b, int c) {
		return (a - b - c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subtract subtract= new Subtract();
  System.out.println(subtract.subtract1(77, 80));
		System.out.println(subtract.subtract1(80, 90, 100));
	}

}
