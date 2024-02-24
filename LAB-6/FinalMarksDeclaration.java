package Result;

import CIE.Internal;
import SEE.External;

public class FinalMarksDeclaration {
    public static void main(String[] args) {
        int n = 2; // Number of students, you can change this

        Internal[] internalsArray = new Internal[n];
        External[] externalsArray = new External[n];

        // Create objects and input details for Internals and Externals
        for (int i = 0; i < 1; i++) {
            internalsArray[i] = new Internal();
            internalsArray[i].getDetails();
            internalsArray[i].getInternalMarks();

            externalsArray[i] = new External();
            externalsArray[i].getDetails();
            externalsArray[i].getExternalMarks();
        }

        // Display details and calculate final marks for each student
        for (int i = 0; i < 1; i++) {
            System.out.println("\nDetails for Student " + (i + 1));
            internalsArray[i].displayDetails();
            externalsArray[i].displayDetails();
            calculateFinalMarks(internalsArray[i], externalsArray[i]);
        }
    }

    private static void calculateFinalMarks(Internal internals, External external) {
        int[] finalMarks = new int[5];

        System.out.println("\nFinal Marks for Student:");
        for (int i = 0; i < 5; i++) {
            // Assuming final marks are a combination of internal and external marks
            finalMarks[i] = internals.internalMarks[i] + external.externalMarks[i];
            System.out.println("Course " + (i + 1) + ": " + finalMarks[i]);
        }
    }
}
