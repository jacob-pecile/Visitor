package visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Item> items = new ArrayList<Item>();
		
		Item apple = new WeighableItem("Apples", 1.5, 3);
		Item bread = new ScannableItem("Bread", 3);
		
		items.add(apple);
		items.add(bread);
		
		CashOutVisitor co = new CashOutVisitor();
		
		for (Item i : items) {
	      i.accept(co);
	    } 
		
		System.out.print(co.getReceipt());
		System.out.print("-----------\n");
		System.out.print(String.format("total:\t$%.2f", co.getTotal()));
	}
	
}
