import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input base and height in cm
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();
        
        // Calculate area in square cm: 1/2 * base * height
        double areaCm = 0.5 * base * height;
        
        // Convert area to square inches (1 inch = 2.54 cm, so 1 sq inch = 2.54 * 2.54 sq cm)
        double areaInches = areaCm / (2.54 * 2.54);
        
        // Output result
        System.out.println("The Area of the triangle in sq in is " + areaInches + " and sq cm is " + areaCm);
        
        input.close();
    }
}