
public class TestTime {

	public static void main(String[] args) {
		// Test Constructor,toString

		// With Parameter
		Time t1 = new Time(1, 2, 3);
		System.out.println(t1);

		// Default
		Time t2 = new Time();
		System.out.println(t2);

		// Setter,Getter
		t1.setHour(4);
		t1.setMin(5);
		t1.setSec(6);
		System.out.println("\n" + t1);
		System.out.println("Hour is: " + t1.getHour());
		System.out.println("Minute is: " + t1.getMin());
		System.out.println("Second is: " + t1.getSec());

		// Test setTime
		t1.setTime(58, 59, 23);
		System.out.println("\n" + t1.nextSec());

		// Test NextSecod
		System.out.println(t1.nextSec().nextSec().nextSec());
	}

} 
