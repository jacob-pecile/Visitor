package visitor;

public class WeighableItem extends Item{

	private double pricePerLb;
	private double weight;
	private String name;
	
	public WeighableItem(String name, double price, double weight){
		super(name);
		this.pricePerLb = price;
		this.weight = weight;
	}
	
	public double getPricePerLb(){
		return this.pricePerLb;
	}
	
	public double getWeight(){
		return this.weight;
	}
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
