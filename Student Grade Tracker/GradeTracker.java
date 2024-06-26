import java.util.Scanner;

public class GradeTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Students:");
        int numStudents = scanner.nextInt();

        // Create arrays to store student grades

        int[] grades = new int[numStudents];

        // Apply loops for taking grades from the teacher

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter Student's Grade" + (i + 1) + ":");
            grades[i] = scanner.nextInt();
        }

        // Calculate average,highest and lowest score

        int sum = 0;
        int highest = grades[0];
        int lowest = grades[0];

        for (int grade : grades) {
            sum += grade;

            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        // For Average

        double average = (double) sum / numStudents;

        // for displaying result

        System.out.println("\nResults:");
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score:" + lowest);

        scanner.close();
    }

}