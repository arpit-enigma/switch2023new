package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaPractice {

	public static void main(String[] args) {
		LambdaPractice lp = new LambdaPractice();
		lp.doStuff();
		lp.doStuff1();
	}

	private void doStuff1() {
		
	}

	public void doStuff() {
List<String> myList = new ArrayList<>();
myList.add("Nepal");
myList.add("India");
myList.add("Ihina");
myList.add("Russia");

myList.stream()
	.filter((p) -> p.startsWith("I"))
	.sorted()
	.forEach((p)-> System.out.println(p));
	

	}

}
