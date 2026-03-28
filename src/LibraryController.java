import java.util.Scanner;

public class LibraryController {
    private Library library;
    private LibraryView view;
    private Scanner sc = new Scanner(System.in);

    public LibraryController(Library library, LibraryView view) {
        this.library = library;
        this.view = view;
    }

    public void start() {
        while (true) {
            view.showMenu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    library.showBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    library.issueBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    library.returnBook(sc.nextInt());
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}