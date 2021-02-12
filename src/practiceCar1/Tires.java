package practiceCar1;

public class Tires extends CarPart {
	
	public int size;



//method
public Tires() {
	//this.condition = 36;
	this.partDescription = "Tires";
	//this.isflat();
	
}
//constructor
public Tires(int size,  String partDescription,int condition ) {
	this.condition=condition;
	//this.brandName=brandName;
	this.partDescription = partDescription;
	this.size=size;
	
}
public void printSize() {
	System.out.println("The size of your tires is " + size);
}


public void function() {
	if (condition ==100) {
		System.out.println("Your "+ this.partDescription  + " tires are good");
		printSize();
		
	}
	else {
		if (condition ==0 ) {
			System.out.println("Your "+ this.partDescription + " tires are bad");
			printSize();
		}
		else {
			System.out.println("Your"+ this.partDescription + " tires are fair");
			printSize();
		}
	}
	
}

}
