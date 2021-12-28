import java.time.LocalDate;
import java.util.ArrayList;

public class Repository {
    public  ArrayList<TextBook> getTextBook() {
        ArrayList<TextBook> listBook = new ArrayList<>();
        listBook.add(new TextBook(1, "A", "AA", 2021, new String[]{"Khoa Học", "Viễn Tưởng"}, 1000, "AAA", 5000));
        listBook.add(new TextBook(2, "B", "BB", 2019, new String[]{"Vật Lý","Khoa Học"}, 1000, "BBB", 5000));
        listBook.add(new TextBook(3, "C", "CC", 2018, new String[]{"Văn Học","Tiểu Thuyết"}, 1500, "CCC", 2000));
        listBook.add(new TextBook(4, "D", "DD", 2018, new String[]{"Toán","Đại Số"}, 600, "DDD", 4000));
        listBook.add(new TextBook(5, "E", "EE", 2018, new String[]{"Địa Lý","Lịch Sử"}, 780, "EEE", 3000));
        return listBook;
    }
    public  ArrayList<Magazine> getMagazine() {
        ArrayList<Magazine> listMagazine = new ArrayList<>();
        listMagazine.add(new Magazine(11, "M1", "AA", LocalDate.of(2021, 10, 15), new String[]{"Báo Khoa Học"}, 1000, 5000));
        listMagazine.add(new Magazine(22, "M2", "BB", LocalDate.of(2020, 1, 20), new String[]{"Báo Pháp Luật"}, 1000, 5000));
        listMagazine.add(new Magazine(33, "M3", "CC", LocalDate.of(2021, 12, 12), new String[]{"Báo Đời Sống"}, 1500, 2000));
        listMagazine.add(new Magazine(44, "M4", "DD", LocalDate.of(2019, 8, 8), new String[]{"Báo Kinh Tế","Báo Thị Trường"}, 600, 4000));
        listMagazine.add(new Magazine(55, "M5", "EE", LocalDate.of(2021, 5, 19), new String[]{"Tạp Chí Tin Học"}, 780, 3000));
        return listMagazine;
    }
    public ArrayList<EBook> getEBook(){
        ArrayList<EBook> eBooks = new ArrayList<>();
        eBooks.add(new EBook(1,"Ebook 1","abc",2000, new String[]{"Luật Pháp"},100,"abc",20, LocalDate.of(2000,5,10),3.0,100));
        eBooks.add(new EBook(2,"Ebook 2","abc",2013, new String[]{"Toán Logic"},100,"abc",20,LocalDate.of(2002,6,15),2.0,50));
        eBooks.add(new EBook(3,"Ebook 3","abc",2015, new String[]{"Mẹ và Bé"},100,"abc",20,LocalDate.of(2003,7,28),3.0,20));
        eBooks.add(new EBook(4,"Ebook 4","abc",2021, new String[]{"Kinh tế", "Chính Trị"},100,"abc",20,LocalDate.of(2010,8,20),5.0,300));
        eBooks.add(new EBook(5,"Ebook 5","abc",2021, new String[]{"Kinh tế", "Chính Trị"},100,"abc",20,LocalDate.of(2018,9,21),1.0,100));
        eBooks.add(new EBook(6,"Ebook 6","abc",2020, new String[]{"Kinh tế", "Chính Trị"},100,"abc",20,LocalDate.of(2010,8,20),5.0,10));
        eBooks.add(new EBook(7,"Ebook 7","abc",2012, new String[]{"Doanh Nhân"},100,"abc",20,LocalDate.of(2018,9,21),1.0,120));
        return eBooks;
    }
}