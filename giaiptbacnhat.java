package hoanghuy;
import java.util.*;
public class giaiptbacnhat {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Nhập a: ");
	        double a = sc.nextDouble();
	        System.out.print("Nhập b: ");
	        double b = sc.nextDouble();
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình có vô số nghiệm.");
	            } else {
	                System.out.println("Phương trình vô nghiệm.");
	            }
	        } else {
	            double x = -b / a;
	            System.out.println("Nghiệm của phương trình là: x = " + x);
	        }
	        sc.close();
	}

}
