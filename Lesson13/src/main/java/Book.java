import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    @SerializedName("id")
    private int id;
    @SerializedName("title")
    private String title;
    @SerializedName("author")
    private String author;
    @SerializedName("category")
    private String [] category;
    @SerializedName("publishingYear")
    private int publishingYear;
    @SerializedName("publishingCompany")
    private String publishingCompany;
    @SerializedName("pageNumber")
    private int pageNumber;


    @Override
    public String toString() {
        return "Id sách: " + id + " - " +
                "Tiêu đề: " + title + " - " +
                "Tác giả: " + author + " - " +
                "Thể loại: " + Arrays.toString(category) + " - " +
                "Năm xuất bản: " + publishingYear + " - " +
                "Nhà xuất bản: " + publishingCompany + " - " +
                "Số trang: " + pageNumber;
    }
}

