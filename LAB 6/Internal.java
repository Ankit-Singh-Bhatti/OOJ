package CIE;
import CIE.Student;
import java.util.Scanner;

public class Internal extends Student {
    public int[] internalMarks = new int[5];

    public Internal() {
        System.out.println("INTERNALS OBJECT CREATED");
    }

    public void getInternalMarks() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter internal marks for 5 courses:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Course " + (i + 1) + ": ");
            internalMarks[i] = in.nextInt();
        }
    }
}
