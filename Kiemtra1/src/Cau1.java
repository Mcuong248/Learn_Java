import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hình vuông");
        System.out.println("Nhập cạnh của hình vuông");
        int longs = sc.nextInt();
        for (int i = 0; i<longs; i++){
            for (int j = 0; j < longs; j++){
                System.out.print("* \t");
            }
            System.out.println();
        }


        System.out.printf("\nNhập vào chiều cao của tam giác: ");
        int hight = sc.nextInt();
        for (int i = 1; i <= hight; ++i) {
          for (int j = 1; j <= i; ++j) {
            System.out.print("* ");
          }
          System.out.println();
        }

        int chieucao, k = 0;
        System.out.printf("\n\nNhập vào chiều cao của kim tự tháp: ");
        chieucao = sc.nextInt();
        for (int i = 1; i <= chieucao; ++i, k = 0) {
            for (int space = 1; space <= hight - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}
