package test;

public class PatternExecutionInJava {
// Pattern1

	public static void main(String args[]) {
		int rows = 5;
		for (int i = 0; i < rows; i++) // outer loop for number of rows(n)
		{
			for (int j = 0; j <= i; j++) // inner loop for number of columns
			{
				System.out.print("* "); // print star
			}
			System.out.println(); // ending line after each row
		}
		System.out.print("----------------------------------------------------- "); // print star
		// Pyramid
		System.out.println();
		for (int i = 0; i < rows; i++) // outer loop for number of rows(n)
		{
			for (int j = rows - i; j > 1; j--) // inner loop for spaces
			{
				System.out.print(" "); // print space
			}
			for (int j = 0; j <= i; j++) // inner loop for number of columns
			{
				System.out.print("* "); // print star
			}
			System.out.println(); // ending line after each row
		}
		System.out.print("----------------------------------------------------- "); // print star
		System.out.println();

		for (int i = 0; i < rows; i++)
		{
			for (int j = rows - i; j > 1; j--)
			{
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

}
