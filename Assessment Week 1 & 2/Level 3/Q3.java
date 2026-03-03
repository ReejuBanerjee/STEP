import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take salary and bonus as inputs
        System.out.print("Enter Salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter Bonus: ");
        double bonus = input.nextDouble();
        
        // Compute total income
        double totalIncome = salary + bonus;
        
        // Output result in INR
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus 
                            + ". Hence Total Income is INR " + totalIncome);
        
        input.close();
    }
}