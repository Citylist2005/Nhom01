package hoanghuy;
import java.util.*;
public class thanhtien {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap so dau: ");
	        int soDau = sc.nextInt();
	        System.out.print("Nhap so cuoi: ");
	        int soCuoi = sc.nextInt();
	        int tinhTien = (soDau - soCuoi) * 10000;
	        System.out.println("Tien nuoc: " + tinhTien + " VND");
	        sc.close();
	}
}
