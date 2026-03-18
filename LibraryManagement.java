//ct100/g/21350/24
//Eric Maina
//Library
class Book {
    private String title, author, isbn;
    private boolean isIssued;

    public Book(String title, String author, String isbn) {
        this.title = title; this.author = author; this.isbn = isbn;
        this.isIssued = false;
    }

    public String getIsbn() { return isbn; }
    public boolean isIssued() { return isIssued; }
    public void issueBook() { isIssued = true; }
    public void returnBook() { isIssued = false; }

    public void displayBookInfo() {
        System.out.println(title + " by " + author + " (ISBN: " + isbn + ")");
    }
}

class Library {
    private Book[] books = new Book[10];
    private int count = 0;

    public void addBook(Book b) {
        if (count < 10) books[count++] = b;
    }

    public void issueBook(String isbn) {
        for (int i = 0; i < count; i++) {
            if (books[i].getIsbn().equals(isbn)) books[i].issueBook();
        }
    }

    public void returnBook(String isbn) {
        for (int i = 0; i < count; i++) {
            if (books[i].getIsbn().equals(isbn)) books[i].returnBook();
        }
    }

    public void listAvailableBooks() {
        for (int i = 0; i < count; i++) {
            if (!books[i].isIssued()) books[i].displayBookInfo();
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("Java Programming", "Deitel", "111"));
        lib.addBook(new Book("Clean Code", "Robert Martin", "222"));
        lib.addBook(new Book("The Hobbit", "Tolkien", "333"));

        lib.issueBook("111"); 
        lib.returnBook("111");
        lib.issueBook("222");

        System.out.println("--- Available Books ---");
        lib.listAvailableBooks();
    }
}
