import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nhân viên trong công ty: ");
        int numberStaff;
        numberStaff = sc.nextInt();
        Staff[] nhanVien = new Staff[numberStaff];

        System.out.println("Nhập thông tin cho nhân viên: ");
        for (int i = 0; i < numberStaff; i++) {
            System.out.println("Nhập thông tin nhân viên thứ: " +(i + 1));
            System.out.println("1: Chọn nhân viên lập trình, 2:Chọn nhân viên kiểm chứng: ");
            int choose;
            choose = sc.nextInt();

            if (choose == 1){
                nhanVien[i] = new Programmer();
            }else if (choose == 2){
                nhanVien[i] = new Verifier();
            }
            nhanVien[i].insert();
            nhanVien[i].payRoll();
        }

        System.out.println("Thông tin của các nhân viên trong công ty: ");
        for (int i = 0; i < numberStaff; i++) {
            System.out.println(nhanVien[i].toString());
        }
    }
}
