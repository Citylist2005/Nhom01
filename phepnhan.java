package kt;

import java.util.Scanner;

public class phepnhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        int ketQua = a * b;
        System.out.println("Tích của " + a + " và " + b + " là: " + ketQua);

        scanner.close();
    }
}
