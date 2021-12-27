import java.util.Scanner;

public class Controller {
    Service service = new Service();
    Scanner sc  = new Scanner(System.in);

    //tạo phương thức
    public void mainMenu(){
        boolean isCheck = false;
        while (!isCheck){
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:

            }
        }
    }

    public static void menu(){
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Lấy thông tin sách theo từng thể loại (SGK, Tạp chí, Tài liệu điện tử: ");
        System.out.println("2 - Lấy thông tin sách theo thể loại: ");
        System.out.println("3 - Lấy ra thông tin 5 tài liệu điện tử được tải nhiều nhất: ");
        System.out.println("4 - Lấy ra tạp chí, báo được xuất bản trong năm hiện tại: ");
        System.out.println("0 - Dừng chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void menu2(){

    }
}
