package thread123;

public class File {
    static final String one = " ONE_THREAD";
    static final String two = " TWO_THREAD";
    static final String three = " THREE_THREAD";

    public static void main(String[] args) {
        SharedPrinter sharedPrinter = new SharedPrinter();
        Thread oneThread = new Thread(new Task(sharedPrinter, true), one);
        Thread twoThread = new Thread(new Task(sharedPrinter, false), two);
        Thread threeThread = new Thread(new Task(sharedPrinter, null), three);
        oneThread.start();
        twoThread.start();
        threeThread.start();
    }
}