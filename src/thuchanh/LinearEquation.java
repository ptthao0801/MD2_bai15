package thuchanh;
import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        System.out.println("Given an equation 'a*x + b = 0', find 'x'!");
        System.out.println("____________");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        if (a==0){
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        } else {
            double x = -b/a;
            System.out.println("x = "+x);
        }
    }
}
