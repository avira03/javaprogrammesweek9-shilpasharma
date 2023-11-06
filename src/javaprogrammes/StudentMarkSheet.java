package javaprogrammes;

import java.util.Scanner;

public class StudentMarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCounter = 1; //intialize a counter for the number of students

        while (true) {
            // input student details
            System.out.println("\nStudent" + studentCounter + ":");
            System.out.println("Enter student name: ");
            String name = scanner.nextLine();
            System.out.println("Enter marks for subject 1: ");
            int subject1 = scanner.nextInt();
            System.out.println("Enter marks for subject 2: ");
            int subject2 = scanner.nextInt();
            System.out.println("Enter marks for subject 3: ");
            int subject3 = scanner.nextInt();

            // consume the newline character left in the buffer
            scanner.nextLine();

            // calculate total and average marks
            int totalMarks = subject1 + subject2 + subject3;
            double averageMarks = (double) totalMarks / 3;

            //display student details and marks
            char grade;
            if (averageMarks >= 90) {
                grade = 'A';
            } else if (averageMarks >= 80) {
                grade = 'B';
            } else if (averageMarks >= 70) {
                grade = 'C';
            } else if (averageMarks >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // display grade
            System.out.println("Grade:" + grade);

            // ask the user if they want to input marks for another student
            System.out.println("Do you want to enter marks for another student? (yes/no): ");
            String anotherStudent = scanner.nextLine().toLowerCase();

            // check if the user wants to continue entering data
            if (!anotherStudent.equals("yes")) {
                break; // exit the loop if the user does not want to input data for another student
            }

            // increment the student counter
            studentCounter++;
        }
        System.out.println("Program terminated.");


    }
}


