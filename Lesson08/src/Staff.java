import java.util.Scanner;

public class Staff {
    private int id;
    private String name;
    private int age;
    private int numberPhone;
    private String email;
    protected int wage;
    protected int basicSalary;
    Scanner sc = new Scanner(System.in);

    public Staff(){
        super();
    }

    public Staff(int id, String name, int age, int numberPhone, String email, int wage, int basicSalary, Scanner sc) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.numberPhone = numberPhone;
        this.email = email;
        this.wage = wage;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên nhân viên: ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi nhân viên: ");
        age = sc.nextInt();
        System.out.println("Nhâp số điện thoại nhân viên: ");
        numberPhone = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập email nhân viên: ");
        email = sc.nextLine();
        System.out.println("Nhập lương cơ bản của nhân viên: ");
        basicSalary = sc.nextInt();
    }

    public int payRoll(){
        return 0;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                ", wage=" + wage +
                ", basicSalary=" + basicSalary+
                '}';
    }
}
