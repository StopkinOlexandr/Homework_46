import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookList {
  public static void main(String[] args) {
    List<Book> arh = new ArrayList<>();

    arh.add(new Book("B", "bbb", 4));
    arh.add(new Book("A", "ccc", 5));
    arh.add(new Book("A", "aab", 3));
    arh.add(new Book("B", "aaa", 3));

    arh.sort(new BookTitleAuthorComparator());
//    Collections.sort(arh);
    for (Book book : arh) {
      System.out.println(book);
    }

    arh.sort(new BookPagesDownTitleComparator());
    for (Book book : arh) {
      System.out.println(book);
    }
  }
}
