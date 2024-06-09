package library;

import java.util.Date;

public class LibraryService {
    private BookDAO bookDAO;
    private MemberDAO memberDAO;
    private TransactionDAO transactionDAO;
    public LibraryService(BookDAO bookDAO, MemberDAO memberDAO,  TransactionDAO transactionDAO){
        this.bookDAO = bookDAO;
        this.memberDAO = memberDAO;
        this.transactionDAO = transactionDAO;
    }
    public void issueBook(int bookId, int memberId){
        Book book = bookDAO.getBookById(bookId);
        if(book != null && ! book.isIssued()){
            book.setIssued(true);
            Transaction transaction = new Transaction(1, bookId, memberId, new Date());
            transactionDAO.addTransaction(transaction);
            System.out.println("Book issued successfully!");
        }else{
            System.out.println("Book is not available.");
        }
    }
    public void returnBook(int bookId, int memberId){
        Book book = bookDAO.getBookById(bookId);
        if(book != null && book.isIssued()){
            book.setIssued(false);
            Transaction transaction = new Transaction(1,bookId,memberId,null);
            transaction.setReturnDate(new Date());
            transactionDAO.addTransaction(transaction);
            System.out.println("Book returned successfully!");
        }else{
            System.out.println("Book is not issued to anyone.");
        }
    }
}
