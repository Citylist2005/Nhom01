package kt;

import java.util.Scanner;

public class chiahet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println("Không thể chia cho 0.");
        } else if (a % b == 0) {
            System.out.println(a + " chia hết cho " + b);
        } else {
            System.out.println(a + " không chia hết cho " + b);
        }

        scanner.close();
    }
}

