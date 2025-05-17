package tt1;

import java.util.Scanner;

public class doixung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        boolean isSymmetric = isSymmetric(num1, num2);
        System.out.println("Hai số " + num1 + " và " + num2 + (isSymmetric ? " là " : " không phải là ") + "số đối xứng.");
    }

    public static boolean isSymmetric(int a, int b) {
        return a == reverseNumber(b);
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}

