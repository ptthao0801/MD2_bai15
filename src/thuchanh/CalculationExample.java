package thuchanh;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        calculate(a, b);
    }
    public static void calculate(int a, int b){
        try {
            int cong = a + b;
            int tru = a - b;
            int nhan = a * b;
            int chia = a / b;
            System.out.println("Tổng a + b = "+cong);
            System.out.println("Hiệu a - b = "+tru);
            System.out.println("Tích a * b = "+nhan);
            System.out.println("Thương a / b = "+chia);
        } catch (Exception e) {
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
