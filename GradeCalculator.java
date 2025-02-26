import java.util.Scanner;

public class GradeCalculator {

    // Method to determine the grade based on the score
    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        // Calculate and display grade
        String grade = calculateGrade(score);
        System.out.println("Your Grade is: " + grade);

        scanner.close();
    }
}
