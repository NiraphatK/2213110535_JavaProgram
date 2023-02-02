
public class PattanakarnBranch extends Product{
	private int payUnit() {
		return super.getUnit() /2;
	}
	private int freeUnit() {
		return super.getUnit() - payUnit();
	}
	
	@Override
	public int getTotalprice() {
		return payUnit() *100;
	}
	public String toString() {
		return "You buy "+payUnit()+" units, get free "+freeUnit()+" units ("+getTotalprice()+").";
	}
}
