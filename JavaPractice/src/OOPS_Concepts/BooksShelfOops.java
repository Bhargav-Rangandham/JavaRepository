package OOPS_Concepts;

class BooksShelfOops{
	private String Book_Name;
	private String Book_Title;
	private String Book_Author;
	
	public BooksShelfOops(String Book_Name){
		this.Book_Name = Book_Name;
	}
	
	public BooksShelfOops(String Book_Name, String Book_Title){
		this.Book_Name = Book_Name;
		this.Book_Title = Book_Title;
		
	}
	
	public BooksShelfOops(String Book_Name, String Book_Title, String Book_Author){
		this.Book_Name = Book_Name;
		this.Book_Title = Book_Title;
		this.Book_Author = Book_Author;
	}
	
	public String getBook_Name(){
		
		return Book_Name;
	}
	
	public String setBook_Name(String Name) {
		this.Book_Name = Name;
		return Name;
	}
	
	public String getBook_Title() {
		return Book_Title;
	}
	
	public String setBook_Title(String Title) {
		this.Book_Title = Title;
		return Title;
	}
	
	public String getBook_Author() {
		return Book_Author;
	}
	
	public String setBook_Author(String Author) {
		this.Book_Author = Author;
		return Author;
	}
	
}



