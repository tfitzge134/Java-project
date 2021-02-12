package practiceCar1;



public class Engine extends CarPart {
	public int Cylinders;
	
	
	public Engine( ) {
		super();
		this.condition = 0;
		this.partDescription= "Engine";
		
		
	}
	
//constructor
	public Engine(int numberOfCylinders, int condition) {
	
		this.Cylinders =numberOfCylinders;	
	
		this.condition =condition;
		
		this.partDescription="Engine";
	}
	
	public void printCylinders() {
		System.out.println("The number of Cylinder is " + Cylinders);
	}
	
	//print out the function  with messages
	public void function() {
		if (condition ==100) {
			System.out.println("Your "+ this.partDescription  + " is good");
			printCylinders();
		}
		else {
			if (condition ==0 ) {
				System.out.println("Your "+ this.partDescription + " is bad");
				printCylinders();
			}
			else {
				System.out.println("Your "+ this.partDescription + " is fair");
				printCylinders();
			}
		}
		
	}
	
}

