import java.util.Arrays;

public class ElectronicDocuments extends Library{
    private String author;
    private long publishingYear;
    private int uploadDate;
    private double capacity;
    private long downloads;

    public ElectronicDocuments(int id, String name, String[] category) {
        super(id, name, category);
    }

    public ElectronicDocuments(int id, String name, String[] category, String author, long publishingYear, int uploadDate, double capacity, long downloads) {
        super(id, name, category);
        this.author = author;
        this.publishingYear = publishingYear;
        this.uploadDate = uploadDate;
        this.capacity = capacity;
        this.downloads = downloads;
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

    public int getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(int uploadDate) {
        this.uploadDate = uploadDate;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public long getDownloads() {
        return downloads;
    }

    public void setDownloads(long downloads) {
        this.downloads = downloads;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Tác giả: "+author+ " - "+
                "Năm xuất bản: "+publishingYear+ " - "+
                "Ngày upload: "+uploadDate+ " - "+
                "Thể loại: "+Arrays.toString(super.getCategory())+ " - "+
                "Dung lượng: "+capacity+ " - "+
                "Lượt tải: "+downloads;
    }
}
