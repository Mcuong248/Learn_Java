import java.time.LocalDate;
import java.util.ArrayList;

public class ListCustomer {
    public ArrayList<Customer> getData(){
        ArrayList<Customer> listCustomer = new ArrayList<>();
        listCustomer.add(new Customer((listCustomer.size()+1),"Cường", LocalDate.of(2001,8,24),Gender.NAM,"Hà Nội","09123456789","cuong2001@gmail.com"));
        listCustomer.add(new Customer((listCustomer.size()+1),"Nghĩa", LocalDate.of(1998,6,25),Gender.NAM,"Hồ Chí Minh","0915975365","nghia248@gmail.com"));
        listCustomer.add(new Customer((listCustomer.size()+1),"Trang", LocalDate.of(1996,10,18),Gender.NU,"Bắc Ninh","0978945612","trang1996@gmail.com"));
        listCustomer.add(new Customer((listCustomer.size()+1),"Nga", LocalDate.of(1990,12,15),Gender.NU,"Nha Trang","09456123957","nga2005@gmail.com"));
        listCustomer.add(new Customer((listCustomer.size()+1),"Ngọc", LocalDate.of(1995,9,12),Gender.NU,"Hạ Long","0915649845","ngoc240876@gmail.com"));
        return listCustomer;
    }
}
