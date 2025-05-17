package kt;

import java.util.Scanner;

public class sapxephaiso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();

        
        System.out.println("Hai số theo thứ tự tăng dần là:");

        if (a <= b) {
            System.out.println(a + " " + b);
        } else {
            System.out.println(b + " " + a);
        }

        scanner.close();
    }
}

