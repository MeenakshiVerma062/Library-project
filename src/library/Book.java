package library;
 //Models
public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

     // Constructor
     public Book(int id, String title, String author, boolean isIssued){
         this.id = id;
         this.title = title;
         this.author = author;
         this.isIssued = isIssued;
     }

     public int getId() {
          return id;
     }
      public String getTitle() {
         return title;
     }

     public String getAuthor() {
         return author;
     }

     public boolean isIssued() {
         return isIssued;
     }

     public void setId(int id) {
         this.id = id;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public void setAuthor(String author) {
         this.author = author;
     }

     public void setIssued(boolean issued) {
         isIssued = issued;
     }
     // Method
     public void displayDetails(){
         System.out.println("Book ID: "+id);
         System.out.println("Title: "+title);
         System.out.println("Author: "+author);
         System.out.println("Issued: "+(isIssued ? "Yes" : "No"));
     }
 }
