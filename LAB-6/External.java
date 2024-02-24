package SEE;

import CIE.Student;
import java.util.Scanner;

public class External extends Student {
    public int[] externalMarks = new int[5];

    public External() {
        System.out.println("EXTERNAL OBJECT CREATED");
    }

    public void getExternalMarks() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter external marks for 5 courses:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Course " + (i + 1) + ": ");
            externalMarks[i] = in.nextInt();
        }
    }
}
