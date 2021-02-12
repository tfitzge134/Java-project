package practiceCar1;
import java.util.ArrayList;


public class Car {
	//create a new array list named  carcomponent that will store car part strings
ArrayList<CarPart> CarComponents = new ArrayList<>();

public Car() {
	CarComponents.add(new Engine());
	CarComponents.add(new Tires());
	CarComponents.add(new FuelTank());
	CarComponents.add(new Wheel());
	
	
}
public Car( Engine e, Tires t, FuelTank f, Wheel w) {
	CarComponents.add(e);
	CarComponents.add(t);
	CarComponents.add(f);
	CarComponents.add(w);
	
	
}

	public void run() {
		for(int i = 0; i < CarComponents.size(); i++) {
			CarComponents.get(i).function();
			
		}
		
	}

}
