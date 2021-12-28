public  abstract class Employee {
    private int id;
    private String name;
    private int age;
    private long basicSalary;
    private Type type;


    public abstract long calculatorSalary();

    public Employee(int id, String name, int age, long basicSalary, Type type) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public long getBasicSalary() {

        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {

        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "ID nhân viên: " + id + " - " + "Tên nhân viên: " + name + " - " + "Tuổi: " + age + " - " +
                "Lương cơ bản: " + basicSalary + " - ";
    }
}
