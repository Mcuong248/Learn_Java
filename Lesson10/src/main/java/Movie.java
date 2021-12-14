import com.google.gson.annotations.SerializedName;

public class Movie{
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("category")
    private String category;
    @SerializedName("directors")
    private String directors;
    @SerializedName("time")
    private String time; //trong file json time đang kiểu text 0:51 thì làm sao ép sang kiểu int được., 1 là chuyển time sang kiểu String 2 là tạo file json time để number xong truyền max min
    @SerializedName("premiereTime")
    private String premiereTime;
    @SerializedName("view")
    private int view;

    public Movie(int id, String name, String category, String directors, String time, String premiereTime, int view) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.directors = directors;
        this.time = time;
        this.premiereTime = premiereTime;
        this.view = view;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPremiereTime() {
        return premiereTime;
    }

    public void setPremiereTime(String premiereTime) {
        this.premiereTime = premiereTime;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", directors='" + directors + '\'' +
                ", time='" + time + '\'' +
                ", premiereTime='" + premiereTime + '\'' +
                ", view=" + view +
                '}';
    }
}
