import java.util.Scanner;
	public class Main {
		public static void printArrayElements(int[] drawnNumbers) {

			for (int number : drawnNumbers) {

			System.out.print(number + " ");

			}

			}

			public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			int[] drawnNumbers = new int[5];

			for (int i = 0; i < 5; i++) {

			drawnNumbers[i] = scanner.nextInt();

			}

			printArrayElements(drawnNumbers);

			}
	}
	
