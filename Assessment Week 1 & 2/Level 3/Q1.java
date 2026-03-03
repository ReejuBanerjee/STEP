import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input Celsius value
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        
        // Conversion logic
        double fahrenheitResult = (celsius * 9/5) + 32;
        
        // Output result
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
        
        input.close();
    }
}