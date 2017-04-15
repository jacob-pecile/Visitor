package visitor;

public class CashOutVisitor implements Visitor{
	
	private double total = 0;
	private String receipt = "";
	
	public CashOutVisitor() {}
	
	@Override
	public void visit(ScannableItem item) {
		double price = item.getPrice();
		total += price;
		receipt += item.getName() + "\t" + String.format("$%.2f", price) + "\n";
	}

	@Override
	public void visit(WeighableItem item) {
		double price = item.getPricePerLb() * item.getWeight();
		total += price;
		receipt += item.getName() + "\t" + String.format("$%.2f", price) + "\n";
	}
	
	public double getTotal(){
		return this.total;
	}
	
	public String getReceipt(){
		return this.receipt;
	}
	
}
