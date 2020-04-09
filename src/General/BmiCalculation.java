package General;

public class BmiCalculation {
    public static void main(String[] args) {
        double height = 1.75;
        double weight = 73;
        double bmi = weight / (height * height);
        System.out.println("BMI Calculation is - "+bmi);
    }
}
