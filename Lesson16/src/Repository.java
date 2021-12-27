import java.util.ArrayList;

public class Repository {
    public static ArrayList<Account> getData() { //khởi tạo phương thức mới
        ArrayList<Account> listAcc = new ArrayList<>();
        listAcc.add(new Account("0964121051", "Mcuong2482001@", "ngmanhcuong2001@gmail.com"));
        listAcc.add(new Account("NgManhCuong248", "MCuong248001@123", "mcuong248@gmail.com"));
        listAcc.add(new Account("Mcuong2482001", "NgManhCuong2001@", "cuong2482001@gmail.com"));
        return listAcc;
    }
}

