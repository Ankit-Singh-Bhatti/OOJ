import java.util.Scanner;

class WrongAgeException extends Exception {
    WrongAgeException(String message) {
        super(message);
    }
}

class Father {
    int fage;
    Father(int fage) throws WrongAgeException {
        if (fage <= 0) {
            throw new WrongAgeException("Father's age cannot be negative or zero");
        } else {
            this.fage = fage;
            System.out.println("Father's age is: " + fage);
        }
    }
}

class Son extends Father {
    int sage;

    Son(int sage, int fage) throws WrongAgeException {
        super(fage);
        if (sage >= fage) {
            throw new WrongAgeException("Son's age cannot be greater than or equal to father's age");
        } else if (sage <= 0) {
            throw new WrongAgeException("Son's age cannot be negative or zero");
        } else {
            this.sage = sage;
            System.out.println("Son's age is: " + sage);
        }
    }
}

public class lab7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter the father's age:");
            int nf = in.nextInt();
            Father f1 = new Father(nf);

            System.out.println("Enter the Son's age:");
            int ns = in.nextInt();
            Son s1 = new Son(ns, nf);
        } catch (WrongAgeException e) {
            System.out.println("Check age: " + e);
        }
    }
}
