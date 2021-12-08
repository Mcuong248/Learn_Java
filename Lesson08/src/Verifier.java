public class Verifier extends Staff{
    private int errorNumber;

    public Verifier(){
        super();
    }

    public Verifier(int errorNumber) {
        this.errorNumber = errorNumber;
    }

    public int getErrorNumber() {
        return errorNumber;
    }

    public void setErrorNumber(int errorNumber) {
        this.errorNumber = errorNumber;
    }

    @Override
    public void insert(){
        super.insert();
        System.out.println("Nhập số lỗi phát hiện: ");
        errorNumber = sc.nextInt();
    }

    @Override
    public int payRoll(){
        this.wage = this.basicSalary + this.errorNumber * 200000;
        return this.wage;
    }

    @Override
    public String toString() {
        return super.toString()+"Số lỗi phát hiện: "+errorNumber+ " . " + "Lương"+getWage();
    }
}
