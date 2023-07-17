package closeLabBook;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		
		StudentResult.Mark();
	}
}

class StudentResult {
    static void Mark() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        int[][] marks = new int[numStudents][numSubjects];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Calculate total marks and average for each student
        int[] totalMarks = new int[numStudents];
        double[] averageMarks = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            int sum = 0;
            for (int j = 0; j < numSubjects; j++) {
                sum += marks[i][j];
            }
            totalMarks[i] = sum;
            averageMarks[i] = (double) sum / numSubjects;
        }

        // Display the result for each student
        System.out.println("Result of Students:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Total Marks: " + totalMarks[i]);
            System.out.println("Average Marks: " + averageMarks[i]);
            System.out.println();
        }
    }}
