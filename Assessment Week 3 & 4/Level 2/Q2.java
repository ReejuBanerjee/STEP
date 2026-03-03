import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take salary and year of service as input
        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter Years of Service: ");
        int yearsOfService = input.nextInt();
        
        double bonusAmount = 0;

        // Apply 5% bonus if service is more than 5 years
        if (yearsOfService > 5) {
            bonusAmount = salary * 0.05; // 5% calculation
        }
        
        // Print the bonus amount
        System.out.println("The bonus amount is: " + bonusAmount);
        
        input.close();
    }
}