import java.util.Scanner;
public class T3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input radius: ");
        double num1 = input.nextDouble();

        double area = Math.PI * num1 * num1;
        double perimeter = Math.PI * 2 * num1;

        System.out.println("Area of circle is " + area);
        System.out.println("Perimeter of circle is " + perimeter);
    }
}

