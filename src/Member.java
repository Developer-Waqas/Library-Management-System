import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private List<Book> issuedBooks;

    // Constructor for initializing values
    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.issuedBooks = new ArrayList<>();
    }

    // Getter methods -> member id and member name
    public String getMemberId() { return memberId; }
    public String getName() { return name; }

    // Issue book to member
    public void issueBook(Book book) {
        if (!book.isIssued()) {
            book.issueBook();
            issuedBooks.add(book);
        } else {
            System.out.println("✅ "+"This book is already issued to someone else.");
        }
    }

    // Method for returning book
    public void returnBook(Book book) {
        if (issuedBooks.contains(book)) {
            book.returnBook();
            issuedBooks.remove(book);
        } else {
            System.out.println("❌ "+"This member does not get this book.");
        }
    }

    // Method for displaying member details
    public void displayMemberInfo() {
        System.out.println("Member ID: " + memberId + ",\n Name: " + name);
        System.out.print("✨ "+"Issued Books: ");
        if (issuedBooks.isEmpty()) {
            System.out.println("❌ "+"None");
        } else {
            for (Book book : issuedBooks) {
                System.out.print(book.getTitle() + " | ");
            }
            System.out.println();
        }
    }
}
