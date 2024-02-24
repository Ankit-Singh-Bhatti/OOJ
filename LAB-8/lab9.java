public class lab9 {
    static class BMSThread extends Thread {
        
        public void run() {
            try {
                while (true) {
                    System.out.println("BMS College of Engineering");
                    Thread.sleep(10000);
                }
            } catch (InterruptedException e) {
                System.out.println("Exception handled"+e);
            }
        }
    }

    static class CSEThread extends Thread {
        public void run() {
            try {
                while (true) {
                    System.out.println("CSE");
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                System.out.println("Exception handled"+e);
            }
        }
    }

    public static void main(String[] args) {
        
        BMSThread bmsThread = new BMSThread();
        bmsThread.start();
        CSEThread cseThread = new CSEThread();
        cseThread.start();
    }
}
