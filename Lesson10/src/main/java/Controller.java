import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controller {
     Service service;
     ArrayList<Movie> listMovie;
     Scanner sc;

    public Controller() {
        service = new Service();
        listMovie = service.getData();
        sc = new Scanner(System.in);
    }

    public void mainMenu(){
        boolean isCheck = false;
        while (!isCheck){
            System.out.println("Nhap lua chon: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Danh sách: ");
                    service.prinList(listMovie);
                    break;
                case 2:
                    //sap xep theo ten
                    System.out.println("Danh sách sau khi sắp xếp theo tên: ");
                    service.sortByName(listMovie);
                    break;
                case 3:
                    //sap xep theo thời lượng
                    System.out.println("Danh sách sau khi sắp xếp theo thời lượng: ");
                    service.sortByTime(listMovie);
                    break;
                case 4:
                    //sap xep theo lượt xem
                    System.out.println("Danh sách sau khi sắp xếp theo lượt xem: ");
                    service.sortByView(listMovie);
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
        System.out.println("1 - In thông tin các bộ phim ra màn hình");
        System.out.println("2 - Sắp xếp phim theo tên");
        System.out.println("3 - Sắp xếp phim theo thời lượng");
        System.out.println("4 - Sắp xếp phim theo lượt xem");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
}


