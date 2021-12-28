import java.time.LocalDate;
import java.util.*;


public class Service {
    Repository rep = new Repository();
    ArrayList<TextBook> listBook = rep.getTextBook();
    ArrayList<Magazine> listMagazine = rep.getMagazine();
    ArrayList<EBook> listEBook = rep.getEBook();
    Scanner sc = new Scanner(System.in);
    public void printLibraryBook() {
        System.out.println("Toàn bộ Sách Giáo Khoa: ");
        listBook.forEach(i -> System.out.println(i));
    }

    public void printLibraryMagazine(){
        System.out.println("Toàn bộ Báo và Tạp Chí: ");
        listMagazine.forEach(i -> System.out.println(i));
    }

    public void printLibraryEBook(){
        System.out.println("Toàn bộ Tài Liệu Điện Tử: ");
        listEBook.forEach(i -> System.out.println(i));
    }

    public void getLibarryByType() {
        System.out.println("Nhập thể loại sách: ");
        String findType = sc.nextLine();
        ArrayList<Object> listALL = new ArrayList();
        listALL.add("Sách giáo khoa: " + "\n" + listBook);
        listALL.add("Báo, tạp chí: " + "\n" +listMagazine);
        listALL.add("Tài liệu điện tử: " + "\n" + listEBook);
        int count = 0;
        for (Object object: listALL){
            if(object.toString().toLowerCase().contains(findType.toLowerCase())){
                System.out.println(object);
                count++;
            }
        }

        if (count == 0){
            System.out.println("Không có thể loại này");
        }
    }

    public void sortDownloadEBook(){
        Collections.sort(listEBook, new Comparator<EBook>() {
            @Override
            public int compare(EBook o1, EBook o2) {

                return o2.getDownloads()-o1.getDownloads();
            }
        });
        System.out.println("Danh sách 5 tài liệu điện tử có lượt download cao nhất: ");
        for (int i = 0; i < 5; i++){
            System.out.println(listEBook.get(i));
        }

    }

    public void sortYearMagazine(){
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();

        listMagazine.stream().filter(magazine -> magazine.getRelease_day().getYear() == year).forEach(System.out::println);
        long count = listMagazine.stream().filter(magazine -> magazine.getRelease_day().getYear() == year).count();
        if(count == 0){
            System.out.println("Không có Báo/Tạp chí ra mắt trong năm nay");
        }
    }

}