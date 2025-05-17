import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double length = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("Diện tích hình chữ nhật: " + area);
    }
}
