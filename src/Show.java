public static final Book[] books = null;

public static void main(String[] args) {
    // Entry point for the program
}

public void showBooks() {
    if (books == null || books.length == 0) {
        System.out.println("No books available in the library.");
        return;
    }

    System.out.println("\n--- Book List ---");
    System.out.printf("%-5s %-20s %-20s %-10s\n", "ID", "Title", "Author", "Status");

    for (Book b : books) {
        String status = b.isIssued() ? "Issued" : "Available";
        System.out.printf("%-5d %-20s %-20s %-10s\n",
                b.getId(),
                b.getTitle(),
                b.getAuthor(),
                status);
    }
}