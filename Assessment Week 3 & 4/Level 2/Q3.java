import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take integer input and store it in variable 'number'
        System.out.print("Enter a number to find its multiplication table (6-9): ");
        int number = input.nextInt();
        
        // Using a for loop to find multiplication from 6 to 9
        for (int i = 6; i <= 9; i++) {
            // Print in the format: number * i = result
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
        
        input.close();
    }
}