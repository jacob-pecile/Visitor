package visitor;

public class ScannableItem extends Item{

	private double price;
	private String name;
	
	public ScannableItem(String name, double price){
		super(name);
		this.price = price;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
