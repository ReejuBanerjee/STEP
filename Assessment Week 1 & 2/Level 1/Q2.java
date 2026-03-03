public class Q2 {
    public static void main(String[] args) {
        // Marks provided in the problem
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        
        // Calculate average
        // We divide by 3.0 to ensure the result is a double (decimal)
        double average = (maths + physics + chemistry) / 3.0;
        
        // Output format as required
        System.out.println("Sam’s average mark in PCM is " + average);
    }
}