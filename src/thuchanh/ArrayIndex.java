package thuchanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndex {
    public static int[] createRandom(){
        // Tạo mảng
        int[] arr = new int[100];

        // Tạo số nguyên 0 -> 100
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(101);
        }
        return arr;
    }

    public static void main(String[] args) {
        //Nhap vap chi so bat ky tu 1 - 100
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

        // Tao array random tu 0 - 100
        int[] arr = createRandom();

        //Print gia tri cua index do trong mang arr
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + index + " là " + arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
