import java.util.Scanner;

// Generates sum of five digits using recursion
class RecursiveSum {
	
	static int sum(int x) {
		if (x<1) {
			return 0;
		} else {
			return (x%10 + sum(x/10));
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 digits (on one line) to generate its sum");
		int number = input.nextInt();
		System.out.println(sum(number));
		input.close();
	}

}
