package thread123;

public class TaskPractice implements Runnable{

	private SharedPrinterPractice sharedPrinter = new SharedPrinterPractice();
	private int indicator;

	public TaskPractice(SharedPrinterPractice sharedPrinter, int indicator) {
		this.sharedPrinter = sharedPrinter;
		this.indicator = indicator;
	}

	@Override
	public void run() {
		
		if ((indicator==1) && Thread.currentThread().getName().equals("one"))
		{
			
		}
	}


}
