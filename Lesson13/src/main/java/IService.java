import java.util.ArrayList;
import java.util.Map;

public interface IService {

    ArrayList<Book> getData();
    public void printList( ArrayList<Book> list);
    public void sortByPublishingYear( ArrayList<Book> list);
    public void findBookName( ArrayList<Book> list);
    public void printListCategory(ArrayList<Book> list);
}
