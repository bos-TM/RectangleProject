import java.util.Scanner;

public class Rectangle {
    static double side1;
    static double side2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть довжину першої сторони прямокутника: ");
        side1 = scanner.nextDouble();

        System.out.print("Введіть довжину другої сторони прямокутника: ");
        side2 = scanner.nextDouble();


        double rectangle = areaCalculator(side1, side2);
        double perimeter = perimeterCalculator(side1, side2);

        System.out.println("Площа прямокутника: " + rectangle);
        System.out.println("Периметр прямокутника: " + perimeter);
    }

    static double areaCalculator(double side1, double side2){
        return side1 * side2;
    }

   static double perimeterCalculator(double side1, double side2) {
        return 2 * (side1 + side2);
    }
}
