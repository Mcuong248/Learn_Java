import java.util.Scanner;

public class Service {
    ServiceEmployee<Waiter> listWaiter;
    ServiceEmployee<Kitchen> listKitchen;

    public void printAllEmployee() {
        listWaiter = Repository.addWaiter();
        listKitchen = Repository.addKitchen();
        System.out.println("Danh sách nhân viên bồi bàn: ");
        listWaiter.display();
        System.out.println("Danh sách nhân viên bếp: ");
        listKitchen.display();

    }
    public void printWaiter() {
        listWaiter = Repository.addWaiter();
        System.out.println("Danh sách nhân viên bồi bàn: ");
        listWaiter.display();
    }

    public void printKitchen() {
        listKitchen = Repository.addKitchen();
        System.out.println("Danh sách nhân viên bếp: ");
        listKitchen.display();
    }

    public void insertNewEmployee() {
        listWaiter = Repository.addWaiter();
        listKitchen = Repository.addKitchen();
        Type type = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Thêm nhân viên mới: ");
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập lương cơ bản: ");
        long basicSalary = Long.parseLong(sc.nextLine());
        System.out.println("Nhập 1 để chọn nhân viên bàn, 2 để chọn nhân viên bếp");
        int choose = Integer.parseInt(sc.nextLine());
        if (choose == 1){
            type = Type.Waiter;
        }
        if (choose == 2){
            type = Type.Kitchen;
        }
        System.out.println("Chọn 1 để nhập tiền típ - Chọn 2 để nhập tiền lương dịch vụ");
        int choice = Integer.parseInt(sc.nextLine());
        if (choice == 1) {
            System.out.println("Nhập tiền tip: ");
            long compensate = Long.parseLong(sc.nextLine());
            Waiter newWaiter = new Waiter(id, name, age, basicSalary, type, compensate);
            listWaiter.add(newWaiter);
            System.out.println("Thêm thành công nhân viên phục vụ");
            System.out.println("Danh sách sau khi thêm: ");
            System.out.println("Nhân viên phục vụ:");
            listWaiter.display();
        } else if (choice == 2) {
            System.out.println("Nhập tiền lương dịch vụ: ");
            long serviceCharge = Long.parseLong(sc.nextLine());
            Kitchen newKitchen = new Kitchen(id, name, age, basicSalary, type, serviceCharge);
            listKitchen.add(newKitchen);
            System.out.println("Thêm thành công nhân viên bếp");
            System.out.println("Danh sách sau khi thêm: ");
            System.out.println("Nhân viên bếp:");
            listKitchen.display();
        } else {
            System.out.println("Không có lựa chọn này");
        }
    }
}

