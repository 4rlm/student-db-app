package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

  public static void main(String[] args) {

    // Ask how many new students to enroll
    System.out.print("Enter number of new students to enroll: ");
    Scanner in = new Scanner(System.in);

    int numOfStudents = in.nextInt();
    Student[] students = new Student[numOfStudents];

    // Create a number of students to loop through
    for (int n = 0; n < students.length; n++) {
      students[n] = new Student();
      students[n].enroll();
      students[n].payTuition();
    }

    for (int i = 0; i < students.length; i++) {
      System.out.println(students[1].showInfo());
    }

  }
}
