
public class Main {
    public static void main(String[] args){
        //Câu 1
        double a = 5;
        double b = 7;
        System.out.println("Calculator.add(a, b): "+Calculator.add(a, b));
        System.out.println("Calculator.subtract(a,b): "+Calculator.subtract(a, b));
        System.out.println("Calculator.multi(a,b): "+Calculator.multi(a, b));
        System.out.println("Calculator.div(a,b): "+Calculator.div(a, b));



        //Câu 2
        Bmi.bmiUsingVoid();
        System.out.println("Chỉ số bmi: "+Bmi.bmiUsingDouble());
        System.out.println("Chỉ số bmi: "+Bmi.bmiUsingDoubleWithParameters(1.5, 40));
    }
}
