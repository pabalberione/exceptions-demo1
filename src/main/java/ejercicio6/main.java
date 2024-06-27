package ejercicio6;

public class main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("1984", 5);
        library.addBook("Brave New World", 3);

        try {
            library.borrowBook("1984", 2);
            System.out.println("Borrowed 2 copies of 1984.");
            System.out.println("Remaining 1984 copies: " + library.getBookQuantity("1984"));

            library.borrowBook("Brave New World", 4);
        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    }

