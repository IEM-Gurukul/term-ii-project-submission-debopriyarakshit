public final Book[] books = null;

public static void main(String[] args) {
    // Entry point for the application
}

public void returnBook(int id) {
    Book b = findBook(id);
    if (b != null && b.isIssued()) {
        b.returnBook();
        System.out.println("Book Returned!");
    } else {
        System.out.println("Invalid Operation!");
    }
}

private Book findBook(int id) {
    for (Book book : books) {
        if (book.getId() == id) {
            return book;
        }
    }
    return null;
}