import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Controller {
    Service service;
    ArrayList<Book> listBook;
    Scanner sc;

    public Controller(){
        service =  new Service();
        listBook = service.getData();
        sc = new Scanner(System.in);
    }

    public void mainMenu(){
        boolean isCheck = false;
        while (!isCheck){
            menu();
            System.out.println("Nhập lựa chọn");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("In danh sách toàn bộ sách");
                    service.printList(listBook);
                    break;
                case 2:
                    System.out.println("Danh sách Lọc sách theo thể loại");
                    service.printListCategory(listBook);
                    break;
                case 3:
                    System.out.println("Đếm sách theo thể loại");
                    service.countByCategory();
                    count();
                    break;
                case 4:
                    System.out.println("Danh sách sắp xếp theo năm xuất bản");
                    service.sortByPublishingYear(listBook);
                    break;
                case 5:
                    System.out.println("Tìm sách theo tên");
                    service.findBookName(listBook);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");

            }
        }
    }

    public static void menu(){
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - In ra toàn bộ sách");
        System.out.println("2 - Lọc sách theo thể loại");
        System.out.println("3 - Đếm số sách theo thể loại");
        System.out.println("4 - Sắp xếp theo năm xuất bản");
        System.out.println("5 - Tìm sách theo tên");
        System.out.println("0 - Dừng chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public void count(){
        Map<String, Integer> countType = service.countByCategory();
        for (Map.Entry<String, Integer> entry : countType.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

