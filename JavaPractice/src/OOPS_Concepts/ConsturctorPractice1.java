package OOPS_Concepts;

// Method 1: Non Parameterized Constructor

class Student {
	String Name;
	int Age;
	String College;

	public void Student_info() {
		System.out.println("Name     Age   College\n");
		System.out.println(this.Name+"  "+this.Age+"  "+this.College);
	}
	// Creating  Non-Paramterized Constructor
	Student(){
		System.out.println("Non parametrized Constructer called\n");
	}
	// Creating  Paramterized Constructor
	Student(String Name, int Age, String College){
		this.Name=Name;
		this.Age=Age;
		this.College=College;
		System.out.println("Parameterized Constructor\n");
		System.out.println(Name+"  "+Age+"  "+College);
	}
}

	public class ConsturctorPractice1 {

		public static void main(String[] args) {
			Student st = new Student();
			st.Name="Bhargav";
			st.Age=26;
			st.College="GIST";
			st.Student_info();
			
			Student s1 = new Student("Sruthi", 24, "GIST");
		
	}
}
