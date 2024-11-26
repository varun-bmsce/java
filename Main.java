import CIE.*;
import SEE.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

                Student[] students = new Student[n];
        Internals[] internals = new Internals[n];
        External[] externals = new External[n];

        for (int i = 0; i < n; i++) {
                        System.out.println("\nEnter details for student " + (i + 1));
            System.out.print("Enter USN: ");
            String usn = scanner.next();
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter semester: ");
            int sem = scanner.nextInt();

                      students[i] = new Student(usn, name, sem);
            internals[i] = new Internals();
            externals[i] = new External(usn, name, sem);

                        System.out.println("Enter internal marks for 5 courses: ");
            int[] internalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                internalMarks[j] = scanner.nextInt();
            }
            internals[i].setInternalMarks(internalMarks);

                        System.out.println("Enter external marks for 5 courses: ");
            int[] externalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                externalMarks[j] = scanner.nextInt();
            }
            externals[i].setExternalMarks(externalMarks);
        }

        System.out.println("\nFinal Marks of Students:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent: " + students[i].name + " (" + students[i].usn + ")");
            int[] internalMarks = internals[i].getInternalMarks();
            int[] externalMarks = externals[i].getExternalMarks();
            int[] finalMarks = new int[5];

            for (int j = 0; j < 5; j++) {
                finalMarks[j] = internalMarks[j] + externalMarks[j];
                System.out.println("Course " + (j + 1) + " - Final Marks: " + finalMarks[j]);
            }
        }

        scanner.close();
    }
}
