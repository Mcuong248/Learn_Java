public class Bmi {
    public static void bmiUsingVoid(){
        double height = 1.5;
        double weight = 40;
        double bmi = weight/(height*height);
        System.out.println("Chỉ số bmi: " + bmi);
    }

    public static double bmiUsingDouble(){
        double height = 1.5;
        double weight = 40;
        double bmi = weight/(height*height);
        return bmi;
    }

    public static double bmiUsingDoubleWithParameters(double height, double weight){
        double bmi = weight/(height*height);
        return bmi;
    }
}
