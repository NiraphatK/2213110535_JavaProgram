
public class Drink {
	private int type;
	private char size;
	
	public Drink(int type ,char size) {
		this.type = type;
		this.size =size;
	}
	public Drink() {
		type = 0;
		size = ' ';
	}
	public String getTypeName() {
		return (type==1)?"Hot":
			(type==2)?"Cold":
				"";
	}
	public int getTypePrice() {
		return (type==1)?10:
			(type==2)?20:
				0;
	}
	public  String getSizeName() {
		return (size=='s'&&size=='S')?"Small":
			(size=='m'&&size=='M')?"Medium":
				(size=='l'&&size=='L')?"Large":
					"";
	}
	public int getSizePrice() {
		return (size=='s'&&size=='S')?10:
			(size=='m'&&size=='S')?20:
				(size=='l'&&size=='S')?25:
					0;
	}
	public int getTotalPrice() {
		return getSizePrice()+getTypePrice();
	}
}
