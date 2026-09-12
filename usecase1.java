public class LibraryTest {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "J. Author", 350.0, "ISBN001");
        Book b2 = new Book("OOP Concepts", "K. Writer", 420.0, "ISBN002");
 
        System.out.println(b1.getTitle() + " by " + b1.getAuthor());
        System.out.println("Price: " + b2.getPrice());
        System.out.println("Library: " + Book.libraryName);
        System.out.println("Total books added: " + Book.bookCount);
    }
}
class Book{
    public String title;
    private String author;
    private double price;
    private String isbn;
    static String libraryName = "Central Library";
    static int bookCount = 0;

    final String type = "Book";
    Book(String t, String a, double p, String i) {
        title = t;
        author = a;
        price = p;
        isbn = i;
        bookCount++;
    }
    
    public String getTitle(){
        return Title;
    }
    public void setTitle(String t){
        title.Ttitle=t;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String a){
        title.author=a;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double p){
        title.price=p;
    }
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String i){
        title.isbn=i;
    }

}