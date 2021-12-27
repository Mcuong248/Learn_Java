import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Service implements IService {
    Scanner sc = new Scanner(System.in);
    ArrayList<Book> listBook = getData();
    public ArrayList<Book> getData() {
        ArrayList<Book> list = new ArrayList<>();

        //Tạo đối tượng gson
        Gson gson = new Gson();

        //Đọc file
        try {
            FileReader reader = new FileReader("Book.json");
            //Lấy kiểu mong muốn được convert sang
            Type objectType = new TypeToken<ArrayList<Book>>() {}.getType();
//            System.out.println(objectType);


            list = gson.fromJson(reader, objectType);
//            for (Book b : list){
//            System.out.println(b);
//        }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return list;
    }
    public void printList(ArrayList<Book> list) {
        for (Book b : list) {
            System.out.println(b);
        }
    }

    @Override
    public void sortByPublishingYear(ArrayList<Book> list) {
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {

                return o1.getPublishingYear()- o2.getPublishingYear();
            }
        });
        printList(list);
    }

    @Override
    public void findBookName(ArrayList<Book> list) {
        System.out.println("Nhập tên sách muốn tìm kiếm: ");
        String n = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTitle().toLowerCase().contains(n.toLowerCase())) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    public void printListCategory(ArrayList<Book> list) {
        System.out.println("Nhập thể loại sách muốn tìm: ");
        String n = sc.nextLine();
        for (Book book : listBook) {

            for (int i = 0; i < book.getCategory().length; i++) {
                if (book.getCategory()[i].toLowerCase().contains(n.toLowerCase())) {
                    System.out.println(book);
                }
            }
        }
    }
    public Map<String, Integer> countByCategory(){
        Map<String, Integer> mapType = new HashMap<>();
        for(Book book : listBook){
            for (int i = 0; i< book.getCategory().length;i++){
                if(mapType.get(book.getCategory()[i]) == null){
                    mapType.put(book.getCategory()[i], 1);
                }else{
                    mapType.put(book.getCategory()[i], mapType.get(book.getCategory()[i]) + 1);
                }
            }
        }
        return mapType;
    }
}