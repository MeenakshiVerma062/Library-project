package library;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book(1,"Effective Java","Joshua Bloch",false);
        Book book2 = new Book(2,"Java The Complete Reference Book", "Herbert Schildt",false);
        book1.displayDetails();
        book2.displayDetails();

        BookDAO bookDAO = new BookDAO();
        MemberDAO memberDAO = new MemberDAO();

        TransactionDAO transactionDAO = new TransactionDAO();
        LibraryService libraryService = new LibraryService( bookDAO, memberDAO, transactionDAO);
        // add some books and members
        bookDAO.addBook(new Book(1,"Effective Java", "Joshua Bloch", false));
        bookDAO.addBook(new Book(2, "Java: The Compelete Reference", "Herbert Schildt", false));
        memberDAO.addMember(new Member(1,"Alice","Gold"));
        memberDAO.addMember(new Member(2,"Bob", "Silver"));
        // issues and return books
        libraryService.issueBook(1,1);
        libraryService.returnBook(1,1);
    }
}
