import java.util.Random;
import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int randomNumber = ran.nextInt(30);
        System.out.println("Số ngẫu nhiên là: "+randomNumber);
        if (isPrimeNumber(randomNumber)){
            System.out.println(randomNumber + " Là số nguyên tố");
        }else {
            System.out.println(randomNumber + " Không phải số nguyên tố");
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
