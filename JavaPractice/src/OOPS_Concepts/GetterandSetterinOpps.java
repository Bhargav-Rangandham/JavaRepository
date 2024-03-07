package OOPS_Concepts;

class Dog{
	
	private String Dog_Name;
	private String Dog_Breed;
	//private String Dog_Origin;
	
	Dog(String Name, String Breed){
		this.Dog_Name =  Name;
		this.Dog_Breed = Breed;
		//this.Dog_Origin = Origin;
	}
	
	public String getDogName() {
		return Dog_Name;
	}
	
	public String setDogName(String Name) {
		this.Dog_Name=Name;
		return Name;
	}
	
	public String getDogBreed() {
		return Dog_Breed;
	}
	
	public String setDogBreed(String Breed) {
		this.Dog_Breed = Breed;
		return Breed;
	}
	
	public void Dog_Info() {
		System.out.println("Dog Name is "+ Dog_Name + " Dog Breed is "+Dog_Breed);
	}
	
	
}
public class GetterandSetterinOpps {
	
	public static void main(String[] args) {
		//Getting the Details
		Dog d = new Dog("Browsey", "Labrador");
		
		d.Dog_Info();
		
		//Setting or Updating the Details
		
		d.setDogName("Trixy");
		d.setDogBreed("German Shephard");
		d.Dog_Info();
	}

}
