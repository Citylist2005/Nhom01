package tt1;

import java.util.Scanner;

public class Sonhonhat2so {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();

        double max = (num1 > num2) ? num1 : num2;
        System.out.println("Số lớn nhất là: " + max);
    }
}
