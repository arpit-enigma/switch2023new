package thread123;

public class FilePractice {
	 static final String one = " ONE_THREAD";
	    static final String two = " TWO_THREAD";
	    static final String three = " THREE_THREAD";

	    public static void main(String[] args) {
	        SharedPrinterPractice sharedPrinter = new SharedPrinterPractice();
	        Thread oneThread = new Thread(new TaskPractice(sharedPrinter, 1), one);
	        Thread twoThread = new Thread(new TaskPractice(sharedPrinter, 0), two);
	        Thread threeThread = new Thread(new TaskPractice(sharedPrinter, 0), three);
	        oneThread.start();
	        twoThread.start();
	        threeThread.start();
	    }
}
