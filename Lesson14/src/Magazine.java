import java.util.Arrays;

public class Magazine extends Library{
    private String newspaperOffice;
    private int publicationDate;
    private int pageNumber;
    private long quantily;

    public Magazine(int id, String name, String[] category) {
        super(id, name, category);
    }

    public Magazine(int id, String name, String[] category, String newspaperOffice, int publicationDate, int pageNumber, long quantily) {
        super(id, name, category);
        this.newspaperOffice = newspaperOffice;
        this.publicationDate = publicationDate;
        this.pageNumber = pageNumber;
        this.quantily = quantily;
    }

    public String getNewspaperOffice() {
        return newspaperOffice;
    }

    public void setNewspaperOffice(String newspaperOffice) {
        this.newspaperOffice = newspaperOffice;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public long getQuantily() {
        return quantily;
    }

    public void setQuantily(long quantily) {
        this.quantily = quantily;
    }

    @Override
    public String toString() {
        return super.toString()+"Tòa soạn: "+newspaperOffice+ " - "+"Ngày xuất bản: "+publicationDate+ " - "
                +"Thể loại"+ Arrays.toString(getCategory())+ " - "+"Số trang: "+pageNumber+ " - "
                +"Số lượng: "+quantily;
    }
}
