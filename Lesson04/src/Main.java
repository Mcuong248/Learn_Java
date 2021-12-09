 import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số phần tử: ");
            int n = sc.nextInt();
            String [] strArray = new String[n];
            System.out.println("Nhập các phần tử cho mảng: ");
            sc.nextLine();//Xử lý trôi lệnh
            //Nhập phần tử cho mảng
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + i + ": ");
                strArray[i] = sc.nextLine();
            }
            //Đếm số lần xuất hiện Java
            int count = 0;
            for(int i = 0; i < strArray.length; i++){
                if(strArray[i].contains("Java")){
                    count++;
                }
            }
            System.out.println("Số lần xuất hiện Java là: "+ count);

            //Kiểm tra vị trí của chuỗi
            for(int i = 0; i < strArray.length; i++){
                if(strArray[i].equals("Java,JS,HTML")){
                    System.out.println("Vị trí của chuỗi Java,JS,HTML là: " + i);
                }
            }
        }
    }
