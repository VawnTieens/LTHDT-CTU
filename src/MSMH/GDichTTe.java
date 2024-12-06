package MSMH;

import java.util.Scanner;

public class GDichTTe extends GDich {
	private int sluong;
	private String loai; //V, U, E
	private double tgia;
	
	public GDichTTe() {
		super();
		sluong = 0;
		loai = "";
		tgia = 0.0;
	}
	public GDichTTe(GDichTTe gd) {
		sluong = gd.sluong;
		loai = gd.loai;
		tgia = gd.tgia;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ti gia: ");
		tgia = sc.nextDouble();
		System.out.println("Nhap so luong: ");
		sluong = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap loai tien te(USD/EUR/VND): ");
		loai = sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.println("Ti gia: " + tgia);
		System.out.println("So luong: " + sluong);
		System.out.println("Loai tien te: " + loai);
	}
	public boolean kiemTraGiaTri() {
		return (sluong * tgia) > 100000;
	}
	public static void main(String[] args) {
		GDichTTe gd1 = new GDichTTe();
		System.out.println("Nhap thong tin cho giao dich gd1: ");
		gd1.nhap();
		
		GDichTTe gd2 = new GDichTTe(gd1);
		System.out.println("\nThong tin giao dich gd1: ");
		gd1.in();
		
		System.out.println("\nThong tin giao dich gd2(sao chep tu gd1): ");
		gd2.in();
		
		if (gd1.kiemTraGiaTri()) {
			System.out.println("\nGiao dich gd1 co gia tri tren 100000 VND");
		} else {
			System.out.println("\nGiao dich gd1 khong co gia tri tren 100000 VND");
		}
	}
}







