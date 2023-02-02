
public class Coffee extends Drink{
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;

	public Coffee(int type, char sizeCoffee, int typeCoffee, Barista barista) {
		super(type,sizeCoffee);
		this.sizeCoffee = sizeCoffee;
		this.typeCoffee = typeCoffee;
		this.barista = barista;
		
	}
	public Coffee(int type,int typeCoffee) {
		super(type,' ');
		this.typeCoffee = typeCoffee;
		sizeCoffee = ' ';
		barista = null;
		
		
	}
	@Override
	public String getTypeName() {
		return (typeCoffee==1)?"Americano"
				:(typeCoffee==2)?"Espresso"
						:(typeCoffee==3)?"Cappucino"
								:"";
	}
	@Override
	public int getTypePrice() {
		return (typeCoffee==1)?50
				:(typeCoffee==2)?55
						:(typeCoffee==3)?65
								:0;
	}
	@Override
	public String getSizeName() {
		return (sizeCoffee=='s')?"Short":
			(sizeCoffee=='t')?"Tall":
				(sizeCoffee=='g')?"Grande":
					(sizeCoffee=='v')?"Venti":
						"";
	}
	@Override
	public int getSizePrice() {
		return (sizeCoffee=='s')?100:
			(sizeCoffee=='t')?150:
				(sizeCoffee=='g')?200:
					(sizeCoffee=='v')?250:
						null;
	}
	public int getTotalPrice() {
		return super.getTypePrice()+this.getTypePrice()+this.getSizePrice();
	}
	public String toString() {
		return super.getTypeName()+" "+this.typeCoffee+" ("+this.sizeCoffee+") is "+this.getTotalPrice()+" baht.";
	}
}
