package baitap;

import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {
        System.out.println("Nhap vao 3 canh cua 1 tam giac");
        Scanner scanner = new Scanner(System.in);
        // Nhap 3 canh
        System.out.print("Nhap canh 1: ");
            int a = scanner.nextInt();
        System.out.print("Nhap canh 2: ");
            int b = scanner.nextInt();
        System.out.print("Nhap canh 3: ");
            int c = scanner.nextInt();

    try {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            // tao doi tuong LoiTamGiac = new, va throw ra doi tuong do
            throw new IllegalTriangleException("Các giá trị nhập vào không hợp lệ.");
        }
        System.out.println("Ba cạnh của tam giác là: " + a + ", " + b + ", " + c);
    } catch (IllegalTriangleException i){
        System.out.println("Lỗi: " + i.getMessage());
    } catch (Exception e) {
        System.out.println("Lỗi không xác định: " + e.getMessage());
    } finally {
        scanner.close();
    }

        }
}
