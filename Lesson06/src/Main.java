import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sản phẩm ");
        int n = sc.nextInt();
        sc.nextLine();

        Shop shops[] = new Shop[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập mã sản phẩm: ");
            int productCode = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập tên sản phẩm: ");
            String productName = sc.nextLine();
            System.out.println("Nhập mô tả của sản phẩm: ");
            String description = sc.nextLine();
            System.out.println("Nhập số lượng sản phẩm: ");
            int quantity = sc.nextInt();
            System.out.println("Nhập giá bán của sản phẩm: ");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.println("Nhập loại của sản phẩm: ");
            String species = sc.nextLine();


            Shop shop1 = new Shop(productCode,productName,description,quantity,price,species);
            shops[i] = shop1;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(shops[i]);
        }
        //Tìm kiếm theo tên sản phẩm
        System.out.println("Nhập tên bạn muốn tìm kiếm: ");
        String findName = sc.nextLine();
        for(int i = 0; i < n; i++){
            if(shops[i].description.contains(findName)){
                System.out.println(shops[i]);
            }
        }
    }
    }

