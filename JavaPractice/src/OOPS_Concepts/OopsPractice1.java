package OOPS_Concepts;

class car {
	String Model;
	String Car_type;
	int Price;
	
	public void carDetails() {
		
		//Method 1
		//System.out.println("Car model is "+Model +" and car type is "+Car_type+" comes at a price range of "+"$"+Price);
	
		//Method 2
		System.out.println("Car model is "+this.Model +" and car type is "+this.Car_type+" comes at a price range of "+"$"+this.Price);
		
		//Both the Methods will print the same output.
	}
}

public class OopsPractice1 {

	public static void main(String[] args) {
		car c1 = new car();
		
		c1.Model="Suzuki";
		c1.Car_type="Swift";
		c1.Price= 20000;
		
		c1.carDetails();
		
		System.out.println();
		
		car c2 = new car();
		
		c2.Model="Tata";
		c2.Car_type="Safari";
		c2.Price=30000;
		
		c2.carDetails();
	}
}
