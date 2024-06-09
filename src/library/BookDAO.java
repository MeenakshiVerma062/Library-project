package library;
import java.util.ArrayList;
import java.util.List;
public class BookDAO {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public Book getBookById(int id){
        for(Book book : books){
            if(book.getId() == id){
                return book;

            }
        }
        return null;
    }
    public List<Book> getAllBooks(){
        return books;
    }
    public void removeBook(int id){
        books.removeIf(book -> book.getId()==id);
    }
}
