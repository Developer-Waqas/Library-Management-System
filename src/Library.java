import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // Method for adding books
    public void addBook(Book book) {
        books.add(book);
        System.out.println("✅ "+"Book added: " + book.getTitle());
    }

    // Method for adding new member
    public void addMember(Member member) {
        members.add(member);
        System.out.println("✅ "+"Member added: " + member.getName());
    }

    // Method for display books
    public void displayAllBooks() {
        System.out.println("✨ "+"\nLibrary Books:");
        for (Book book : books) {
            book.displayBookInfo();
        }
    }

    // Method for display members
    public void displayAllMembers() {
        System.out.println("✨ "+"\nLibrary Members:");
        for (Member member : members) {
            member.displayMemberInfo();
        }
    }

    // Method for book to find by id
    public Book findBookById(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    // Method for member to find by id
    public Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }
}
