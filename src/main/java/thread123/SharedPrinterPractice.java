package thread123;

public class SharedPrinterPractice {

    private volatile Boolean isTurn = true;

    synchronized void printNumber(int number, Boolean isTurn) {
        try {
            while (this.isTurn != isTurn) {
                wait();
            }
            System.out.println(number + Thread.currentThread().getName());
            if (this.isTurn != null && this.isTurn) {
                this.isTurn = false;
            } else if (this.isTurn != null && !this.isTurn) {
                this.isTurn = null;
            } else {
                this.isTurn = true;
            }
            Thread.sleep(1000);
            notifyAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
