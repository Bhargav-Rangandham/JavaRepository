package OOPS_Concepts;

class Student1{
	
	Student1(String Name, int Age, String College){
		//System.out.println("Parameterized Constructor\n");
		System.out.println(Name+"  "+Age+"  "+College+"\n");
	}
}

public class ParametrizedConstructor {
	public static void main(String[] args) {
		
		Student1 s1 = new Student1("Bhargav", 26, "GIST");
		
		Student1 s2 = new Student1("Sruthi", 24, "GIST");
		
		
	}
}
