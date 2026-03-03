import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Read perimeter from user
        System.out.print("Enter perimeter: ");
        double perimeter = input.nextDouble();
        
        // Calculate side: Perimeter = 4 * side
        double side = perimeter / 4;
        
        // Output result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
        input.close();
    }
}