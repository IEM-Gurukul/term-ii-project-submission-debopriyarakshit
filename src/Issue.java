public class Issue {
    Book[] books;

    public Book findBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    public void issueBook(int id) {
        Book b = findBook(id);
        if (b != null && !b.isIssued()) {
            b.issueBook();
            System.out.println("Book Issued!");
        } else {
            System.out.println("Book not available!");
        }
    }

    public static void main(String[] args) {
        // Main method implementation
    }
}