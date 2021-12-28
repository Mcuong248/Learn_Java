public class Waiter extends Employee{
    private long compensate;

    public Waiter(int id, String name, int age, long basicSalary, Type type, long compensate) {
        super(id, name, age, basicSalary, type);
        this.compensate = compensate;
    }

    public long getCompensate() {

        return compensate;
    }

    public void setCompensate(long compensate) {

        this.compensate = compensate;
    }

    @Override
    public long calculatorSalary(){
        return compensate + getBasicSalary();
    }

    @Override
    public String toString() {
        return super.toString() + "Tiền tip: " + compensate + " - " + "Tổng lương lĩnh:: " + calculatorSalary();
    }
}

