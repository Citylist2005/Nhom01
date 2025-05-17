package kt;
import java.util.Scanner;

public class uocchunglonnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        int ucln = timUCLN(a, b);
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + ucln);

        scanner.close();
    }

    // Hàm tính UCLN bằng thuật toán Euclid
    public static int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

