import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Film> listFilm = new ArrayList<>();
        listFilm.add(new Film(19150083, "Avengers", "Action", 2, "Mavel Studios", 2012));
        listFilm.add(new Film(123456,"Joker","psychology",2,"Todd Phillips",2019));
        listFilm.add(new Film(19150082,"The TranSporter","Action",1,"Luc Besson",2002));
        listFilm.add(new Film(456789,"The exorcist","horror",2,"William Friedkin",1973));
        listFilm.add(new Film(159753,"Bố già","humor",2,"Trấn Thành",2021));
        System.out.println(listFilm);

        System.out.println("Danh sách những phim có thể loại Action: ");
        for (int i = 0; i < listFilm.size(); i++) {
            if (listFilm.get(i).getCategory() == "Action") {
                System.out.println(listFilm.get(i));
            }
        }

    }
}
