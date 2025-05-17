import java.util.Scanner;

public class CalculatorCLI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();

        double result = num1 - num2;
        System.out.println("Kết quả phép trừ: " + result);
    }
}
