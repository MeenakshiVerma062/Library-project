package library;
import java.util.Date;
// Models
public class Transaction {
    private int id;
    private int bookId;
    private int memberId;
    private Date issueDate;
    private Date returnDate;

    // Constructor
    public Transaction(int id, int bookId, int memberId, Date issueDate){
        this.id = id;
        this.bookId = bookId;
        this.memberId = memberId;
        this.issueDate = issueDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }
    public Date getReturnDate() {
        return issueDate;
    }

    public void setReturnDate(Date issueDate) {
        this.issueDate = returnDate;
    }

    //Method to display
    public void displayDetails(){
        System.out.println("Transaction ID: "+id);
        System.out.println("Book ID: "+bookId);
        System.out.println("Member ID: "+memberId);
        System.out.println("Issue Date: "+issueDate);
        System.out.println("Return Date: "+(returnDate != null? returnDate : "Not Returned"));
    }
}
