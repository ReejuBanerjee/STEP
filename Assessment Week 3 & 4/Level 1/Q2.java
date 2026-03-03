import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");
        int number1 = input.nextInt(); //
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        // Check if the first is smaller than both the second and third
        boolean isFirstSmallest = (number1 < number2 && number1 < number3);
        
        System.out.println("Is the first number the smallest? " + isFirstSmallest); //
        
        input.close();
    }
}