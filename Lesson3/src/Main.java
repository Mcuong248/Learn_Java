import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Câu 1
        System.out.println("Câu 1: Giải phương trình bậc nhất 1 ẩn ax + b = 0");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a=");
        int a = sc.nextInt();
        System.out.println("Nhập b=");
        int b = sc.nextInt();

        if (a==0)
        {
            if (b==0)
                System.out.println("Phương trình vô số nghiệm");
            else System.out.println("Phương trình vô nghiệm");
        }
        else {
            System.out.println("Nghiệm của phương trình là: " + (float)-b/a);
        }

        //Câu 2
        System.out.println("Câu 2: Giải phương trình bậc hai 1 ẩn ax 2 + bx + c = 0");
        double a1,b1,c, x1, x2, delta;
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập a1 = ");
        a1 = s.nextDouble();
        System.out.println("Nhập b1 = ");
        b1 = s.nextDouble();
        System.out.println("Nhập c = ");
        c = s.nextDouble();

        delta = Math.pow(b1, 2) - 4*a1*c;
        if (a1==0){
            System.out.println("Phương trình lỗi");
        }else{
            if (delta < 0){
                System.out.println("Phương trình vô nghiệm");
            }else if (delta==0){
                x1= -b1/(2*a1);
                System.out.println("Phương trình có 2 nghiệm kép x1=x2=" + x1);
            }else {
                x1 = (-b1 - Math.sqrt(delta))/(2*a1);
                x2 = (-b1 + Math.sqrt(delta))/(2*a1);
                System.out.println("Phương trình có 2 nghiệm phân biệt");
                System.out.println("x1=" +x1);
                System.out.println("x2= "+x2);
            }
        }

        //Câu 3

    }
}
