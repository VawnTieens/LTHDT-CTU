package buoi5;

import java.util.Scanner;

public class KHang {
	private String ten;
	private boolean gtinh;
	private int nsinh;
	
	public KHang() {
		ten = "Nguyen Van A";
		gtinh = true;
		nsinh = 2000;
	}
	public KHang(KHang k) {
		ten = k.ten;
		gtinh = k.gtinh;
		nsinh = k.nsinh;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten khach hang: ");
		ten = sc.nextLine();
		System.out.println("Nhap gioi tinh(True-Nam, False-Nu): ");
		gtinh = sc.nextBoolean();
		System.out.println("Nhap nam sinh: ");
		nsinh = sc.nextInt();
	}
	public void in() {
		System.out.println("Ten khach hang: " + ten);
		System.out.println("Gioi tinh: " + gtinh);
		System.out.println("Nam sinh: " + nsinh);
	}
}
