package practiceCar1;

public class Similator {

	public static void main(String[] args) {
		Car c = new Car ();

			c = new Car(new Engine(4, 0), new Tires(60, "goodYear", 0), new FuelTank(3, 3, 4 ), new Wheel(3,0));

		c.run();
		

	}

}
