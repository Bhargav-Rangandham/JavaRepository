package OOPS_Concepts;

class person {
	String Name;
	int Age;
	String Sex;
	
	person(String Name, int Age, String Sex){
		this.Name=Name;
		this.Age=Age;
		this.Sex=Sex;
		
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}
	public String getSex() {
		return Sex;
	}
}
public class OopsPractice2 {

	public static void main(String[] args) {
		person p = new person("Bhargav", 26, "Male");
		person p1 = new person("Sruthi", 24, "Female");
		
		System.out.println(p.getName()+"  "+p.getAge()+"  "+p.getSex());

		System.out.println(p1.getName()+"  "+p1.getAge()+"  "+p1.getSex());
	}
}
