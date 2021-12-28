import java.util.ArrayList;

public class ServiceEmployee <T>{
    private ArrayList<T> al = new ArrayList<>();

    public void add(T obj) {
        al.add(obj);
    }

    public void display() {
        for (T object : al) {
            System.out.println(object);
        }
    }
}

