import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
    private int id;
    private String name;
    private LocalDate date;
    private Gender gender;
    private String country;
    private String mobile;
    private String email;

    @Override
    public String toString() {
        return "Mã khách hàng: " + id +" - " +
                "Tên: " + name + " - " +
                "Ngày sinh: " + Util.formatDate(date) + " - " +
                "Giới tính: " + gender.getValue() + " - " +
                "Quê quán: " + country + " - " +
                "SĐT: " + mobile + " - " +
                "Email: " + email;
    }
}
