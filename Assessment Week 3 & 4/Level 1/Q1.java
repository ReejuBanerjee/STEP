import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt(); //
        
        // A number is divisible by 5 if the remainder is 0
        boolean isDivisible = (number % 5 == 0);
        
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible); //
        
        input.close();
    }
}