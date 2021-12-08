import java.util.Scanner;

public class Programmer extends Staff {
    private int sogioOvertime;

    public Programmer() {
        super();
    }

    public Programmer(int sogioOvertime) {
        super();
        this.sogioOvertime = sogioOvertime;
    }

    public int getSogioOvertime() {
        return sogioOvertime;
    }

    public void setSogioOvertime(int sogioOvertime) {
        this.sogioOvertime = sogioOvertime;
    }

    @Override
    public void insert() {
        super.insert();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số giờ làm thêm: ");
        sogioOvertime = sc.nextInt();
    }

    @Override
    public int payRoll(){
        this.wage = this.basicSalary + this.sogioOvertime * 200000;
        return this.wage;
    }

    @Override
    public String toString() {
        return super.toString() + "Số giờ làm thêm: " + sogioOvertime + " . " + "Lương: " + getWage();
    }
}