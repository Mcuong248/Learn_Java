import java.util.ArrayList;

public class Repository {
     public ArrayList<TextBook> getTextBook() { //khởi tạo phương thức mới sử dụng đc phương thức add
        ArrayList<TextBook> textBooks = new ArrayList<>();
        textBooks.add(new TextBook(getTextBook().size(), ""));
    }
}
