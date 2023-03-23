import java.util.Comparator;

public class BookPagesDownTitleComparator implements Comparator<Book> {

  public BookPagesDownTitleComparator(){}

  @Override
  public int compare(Book book1, Book book2){

    int pages1 = book1.getPages();
    int pages2 = book2.getPages();
    if(pages2 - pages1 != 0) {
      return pages2 - pages1;
    }

    String title1 = book1.getTitle();
    String title2 = book2.getTitle();
    if (!title1.equals(title2)) {
      return title1.compareTo(title2);
    }
    return 0;
  }
}
