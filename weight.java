import java.util.*;

public class weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kg ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in meter");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
