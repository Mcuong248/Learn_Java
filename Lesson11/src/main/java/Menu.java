import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void choiceMenu(ArrayList<Customer> listCustomer) {

        Service service = new Service();
        Scanner sc = new Scanner(System.in);

        boolean isContinue = false;
        while(!isContinue){
            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    service.printCustomer(listCustomer);
                    break;
                case 2:
                    service.searchCustomer(listCustomer);
                    break;
                case 3:
                    service.addNewCustomer(listCustomer);
                    break;
                case 4:
                    service.findCustomerID(listCustomer);
                    break;
                case 0:
                    isContinue = true;
                    System.exit(1);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }


        }

    }

    public static void menu(){
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Xem toàn bộ thông tin khách hàng");
        System.out.println("2 - Xem thông tin khách hàng Nam/Nữ");
        System.out.println("3 - Thêm thông tin 1 khách hàng mới");
        System.out.println("4 - Tìm thông tin khách hàng theo ID");
        System.out.println("0 - Dừng chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
}