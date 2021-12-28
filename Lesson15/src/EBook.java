import java.time.LocalDate;

public class EBook extends TextBook{
    private LocalDate uploaddate;
    private double data;
    private int downloads;

    public EBook(int id, String name, String author, int release_year, String[] type, int page, String company, int quanlity, LocalDate uploaddate, double data, int downloads) {
        super(id, name, author, release_year, type, page, company, quanlity);
        this.uploaddate = uploaddate;
        this.data = data;
        this.downloads = downloads;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    public LocalDate getUploaddate() {
        return uploaddate;
    }

    public void setData(double data) {
        this.data = data;
    }

    public double getData() {
        return data;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {

        this.downloads = downloads;
    }

    public void setUploaddate(LocalDate uploaddate) {
        this.uploaddate = uploaddate;
    }

    @Override
    public String toString() {
        return super.toString() + " - " +
                "uploaddate: " + Util.formatDate(uploaddate) + " - " +
                "data: " + data + " - " +
                "downloads: " + downloads;
    }
}
