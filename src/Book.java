public class Book {
    private String bookID;
    private String bookTitle;
    private String bookAuthor;
    private boolean isIssued;

    // Constructor for Initializing Book
    public Book(String bookID, String bookTitle, String bookAuthor) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.isIssued = false;
    }

    // Getters method -> book details
    public String getBookId() { return bookID; }
    public String getTitle() { return bookTitle; }
    public String getAuthor() { return bookAuthor; }
    public boolean isIssued() { return isIssued; }
 
    // Method for issuing book
    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("✅ "+bookTitle + " has been issued.");
        } else {
            System.out.println("✅ "+bookTitle + " is already issued.");
        }
    }

    // Method for returning book
    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("✅ "+bookTitle + " has been returned.");
        } else {
            System.out.println("❌ "+bookTitle + " was not issued.");
        }
    }

    // Method for display book
    public void displayBookInfo() {
        System.out.println("Book ID: " + bookID + ",\n Title: " + bookTitle + ",\n Author: " + bookAuthor + ",\n Issued: " + (isIssued ? "Yes" : "No"));
    }
}
