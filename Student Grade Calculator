import java.util.*;

public class Maina {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numSubject = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= numSubject; i++) {
            int marks = sc.nextInt();
            total += marks;
        }
        System.out.println("Total Marks: " + total);
        double average = (double) total / numSubject;
        System.out.println("Average: " + average + "%");

        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
