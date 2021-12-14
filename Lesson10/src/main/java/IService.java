import java.util.ArrayList;

public interface IService {
    public ArrayList<Movie> getData();
    public void prinList(ArrayList<Movie> list);
    public void sortByName(ArrayList<Movie> list);
    public void sortByTime(ArrayList<Movie> list);
    public void sortByView(ArrayList<Movie> list);
}
