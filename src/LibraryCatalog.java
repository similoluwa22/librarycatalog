import java.util.ArrayList;

public class LibraryCatalog{
    public ArrayList<Book> booklist = new ArrayList<>();
    public void addbook (Book thebook) {booklist.add(thebook);}
    public void removebok (String title){
        for (Book thebook : booklist){
            if (thebook.getTitle().equals(title)){
                booklist.remove(thebook);
                break;
        }
    }
}
 public Book findbook(String title){
    for(Book thebook : booklist) {
        if (thebook.getTitle().equals(title)) {
            return thebook;
        }
    }
    return null;
}

public void listbook(){
        for(Book thebook : booklist){
            System.out.println("TITLE" + thebook.getTitle());
            System.out.println("AUTHOR" + thebook.getAuthor());
            System.out.println("ISBN" + thebook.getIsbn());
            System.out.println("GENRE"+ thebook.getGenre());
        }
}
}