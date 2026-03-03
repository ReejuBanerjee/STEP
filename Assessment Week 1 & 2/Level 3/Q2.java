import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input Fahrenheit value
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        // Conversion logic
        double celsiusResult = (fahrenheit - 32) * 5/9;
        
        // Output result
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
        
        input.close();
    }
}