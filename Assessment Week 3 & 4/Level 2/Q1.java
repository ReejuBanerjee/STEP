import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int number = input.nextInt(); //
        
        // Check if the input is a Natural Number (greater than 0)
        if (number <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            // Using a for loop to iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even number"); //
                } else {
                    System.out.println(i + " is odd number"); //
                }
            }
        }
        
        input.close();
    }
}