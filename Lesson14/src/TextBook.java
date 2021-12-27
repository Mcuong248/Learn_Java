import java.util.Arrays;

public class TextBook extends Library{
   private String author;
   private long publishingYear;
   private int pageNumber;
   private String publishingCompany;
   private long quantily;

    public TextBook(int id, String name, String[] category, String author, long publishingYear, int pageNumber, String publishingCompany, long quantily) {
        super(id, name, category);
        this.author = author;
        this.publishingYear = publishingYear;
        this.pageNumber = pageNumber;
        this.publishingCompany = publishingCompany;
        this.quantily = quantily;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(long publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public long getQuantily() {
        return quantily;
    }

    public void setQuantily(long quantily) {
        this.quantily = quantily;
    }

    @Override
    public String toString() {
        return super.toString() + "Tác giả: " +author+ " - "+ "Năm xuất bản: "+publishingYear+ " - "
                +"Thể loại: "+ Arrays.toString(super.getCategory()) + " - "+ "Số trang"+pageNumber+" - "
                +"Nhà xuất bản: "+publishingCompany+ " - "+ "Số lượng: "+quantily;
    }
}
