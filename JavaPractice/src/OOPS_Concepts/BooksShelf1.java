package OOPS_Concepts;

public class BooksShelf1  {

	public static void main(String[] args) {

		// To get the Book details from Parent class		
		BooksShelfOops b = new BooksShelfOops("Heal It");

		System.out.println("Book Name is: "+b.getBook_Name());

		BooksShelfOops b1 = new BooksShelfOops("Heal it", "Heart");

		System.out.println("\nBook Name is: "+b1.getBook_Name()+" and Book Title is: "+b1.getBook_Title());

		BooksShelfOops b2 = new BooksShelfOops("Heal It", "Heart", "By Bhargav");

		System.out.println("\nBook Name is: "+b2.getBook_Name()+" and Book Title is: "+b2.getBook_Name()+" and written: "+b2.getBook_Author());
		
		//To Set the Book Details
		
		b2.setBook_Name("Universe");
		b2.setBook_Title("a Gaint");
		b2.setBook_Author("By Sruthi");
		
		System.out.println("\nBook Name is: "+b2.getBook_Name()+" and Book Title is: "+b2.getBook_Name()+" and written: "+b2.getBook_Author());
		
		
		
	}
}

