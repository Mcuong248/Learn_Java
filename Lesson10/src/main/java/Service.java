import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Service implements IService {
    public ArrayList<Movie> getData() {
        ArrayList<Movie> list = new ArrayList<>();

        //tạo đối tượng gson
        Gson gson = new Gson();

        //đọc file
        try {
            FileReader reader = new FileReader("Movie.json");

            //Lấy kiểu mong muốn đc convert sang
            Type objectType = new TypeToken<ArrayList<Movie>>() {}.getType();
//            System.out.println(objectType);

            list = gson.fromJson(reader, objectType);

//            for (Movie m : list) {
//                System.out.println(m);
//            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file ");
        }
        return list;
    }
    public void prinList(ArrayList<Movie> list){
        for (Movie m : list) {
            System.out.println(m);
        }
    }

    //sap xep theo ten
    @Override
    public void sortByName(ArrayList<Movie> list) {
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o2, Movie o1) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        prinList(list);
    }

    //sap xep theo thoi luong
    @Override
    public void sortByTime(ArrayList<Movie> list) {
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTime().compareTo(o2.getTime());
            }
        });
        prinList(list);
    }

    @Override
    public void sortByView(ArrayList<Movie> list) {
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getView() - o2.getView();
            }
        });
        prinList(list);
    }
}
