package CIE;

import java.util.Scanner;

public class Student {
    protected String usn, name;
    protected int sem;

    public Student() {
        System.out.println("STUDENT OBJECT CREATED");
    }

    public void getDetails() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the student USN, Name, and Semester:");
        usn = in.nextLine();
        name = in.nextLine();
        sem = in.nextInt();
    }

    public void displayDetails() {
        System.out.println("STUDENT DETAILS:\nName: " + name + "\nUSN: " + usn + "\nSemester: " + sem);
    }
}
