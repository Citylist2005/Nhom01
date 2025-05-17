package hoanghuy;
import java.util.*;
public class solonnhat {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Nhập số thứ nhất: ");
	        int a = sc.nextInt();
	        System.out.print("Nhập số thứ hai: ");
	        int b = sc.nextInt();
	        int max = (a > b) ? a : b;
	        System.out.println("Số lớn nhất là: " + max);
	        sc.close();

	}

}
