import java.util.Scanner;

class Student {
    int[] creditsSem1, marksSem1, creditsSem2, marksSem2;
    int subjects1, subjects2;

    void input() {
        Scanner sc = new Scanner(System.in);

        // Semester 1
        System.out.print("Enter subjects in Semester 1: ");
        subjects1 = sc.nextInt();
        creditsSem1 = new int[subjects1];
        marksSem1 = new int[subjects1];
        for (int i = 0; i < subjects1; i++) {
            System.out.print("Credits and Marks for subject " + (i + 1) + ": ");
            creditsSem1[i] = sc.nextInt();
            marksSem1[i] = sc.nextInt();
        }

        // Semester 2
        System.out.print("Enter subjects in Semester 2: ");
        subjects2 = sc.nextInt();
        creditsSem2 = new int[subjects2];
        marksSem2 = new int[subjects2];
        for (int i = 0; i < subjects2; i++) {
            System.out.print("Credits and Marks for subject " + (i + 1) + ": ");
            creditsSem2[i] = sc.nextInt();
            marksSem2[i] = sc.nextInt();
        }
    }

    double calculateSGPA(int[] credits, int[] marks, int subjects) {
        double totalPoints = 0;
        int totalCredits = 0;
        for (int i = 0; i < subjects; i++) {
            totalPoints += getGrade(marks[i]) * credits[i];
            totalCredits += credits[i];
        }
        return totalPoints / totalCredits;
    }

    int getGrade(int marks) {
        if (marks >= 90) return 10;
        else if (marks >= 80) return 9;
        else if (marks >= 70) return 8;
        else if (marks >= 60) return 7;
        else if (marks >= 50) return 6;
        else if (marks >= 40) return 5;
        return 0;
    }

    void display() {
        double sgpa1 = calculateSGPA(creditsSem1, marksSem1, subjects1);
        double sgpa2 = calculateSGPA(creditsSem2, marksSem2, subjects2);
        double cgpa = (sgpa1 + sgpa2) / 2;

        System.out.println("SGPA for Semester 1: " + sgpa1);
        System.out.println("SGPA for Semester 2: " + sgpa2);
        System.out.println("CGPA: " + cgpa);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.input();
        student.display();
    }
}
