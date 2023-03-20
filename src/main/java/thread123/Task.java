package thread123;

class Task implements Runnable {
	private SharedPrinter sharedPrinter;
	private Boolean isTurn;

	public Task(SharedPrinter sharedPrinter, Boolean flag) {
		this.sharedPrinter = sharedPrinter;
		this.isTurn = flag;
	}

	@Override
	public void run() {
//        int number = isTurn != null ? (isTurn ? 1 : 2) : 3;

		int number;
		if (isTurn != null)
		{
			number = 3;
		}
		else 
		{			
			if (isTurn == true)		
			number = 1;
		else
			number = 2;
		}
		
		while (number <= 10) {
			sharedPrinter.printNumber(number, isTurn);
			number += 3;
		}
	}
}
