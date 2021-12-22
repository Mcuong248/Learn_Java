import java.util.Scanner

public class Controller {
    Service service;
    Scanner sc;

    public Controller(){
        service =  new Service();
        sc = new Scanner(System.in);
    }

    public void mainMenu(){
        boolean isCheck = false;
        while (!isCheck){
            System.out.println("Nhập lựa chọn");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Danh sách tất cả nhân viên");
                    service.printAllEmployee();
                    break;
                case 2:
                    System.out.println("Danh sách nhân viên phục vụ");
                    service.printWaiter();
                    break;
                case 3:
                    System.out.println("Danh sách nhân viên bếp");
                    service.printKitchen();
                    break;
                case 4:
                    System.out.println("Thêm 1 nhân viên");
                    service.insertNewEmployee();
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
        System.out.println("1 - In ra danh sách tất cả nhân viên");
        System.out.println("2 - In ra danh sách nhân viên phục vụ");
        System.out.println("3 - In ra danh sách nhân viên bếp");
        System.out.println("4 - Thêm vào danh sách 1 nhân viên");
        System.out.println("0 - Dừng chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
}

