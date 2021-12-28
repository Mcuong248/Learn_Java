public class Kitchen extends Employee {
    private long serviceCharge;

    public Kitchen(int id, String name, int age, long basicSalary, Type type, long serviceCharge) {
        super(id, name, age, basicSalary, type);
        this.serviceCharge = serviceCharge;
    }

    public long getServiceCharge() {

        return serviceCharge;
    }

    public void setServiceCharge(long serviceCharge) {

        this.serviceCharge = serviceCharge;
    }

    @Override
    public long calculatorSalary() {
        return (serviceCharge + getBasicSalary());
    }

    @Override
    public String toString() {
        return super.toString() + "Tiền dịch vụ: " + serviceCharge + " - " + "Tổng lương lĩnh: " + calculatorSalary();
    }

}