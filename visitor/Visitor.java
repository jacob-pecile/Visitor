package visitor;

public interface Visitor {
	
	public void visit(ScannableItem item);
	
	public void visit(WeighableItem item);
}
