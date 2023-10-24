import javax.security.sasl.AuthorizeCallback;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Book thebook = new Book("Thefuture", "Neil Hilborn", "978194375310", "Poetry");

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter book title \n");
        String title = scanner.nextLine();
        thebook.setTitle(title);

        System.out.println("please entre authors name \n");
        String author = scanner.nextLine();
        thebook.setAuthor(author);


        System.out.println("please enter isbn number \n");
        String isbn = scanner.nextLine();
        thebook.setIsbn(isbn);

        System.out.println("please enter genre \n");
        String genre = scanner.nextLine();
        thebook.setGenre(genre);


    }

}