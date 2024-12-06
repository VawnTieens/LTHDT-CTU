package MSMH;

import java.util.Scanner;

public class GDich {
	private int mgd;
	private String hten;
	private String ngay;
	private boolean tthai;
	
	public GDich() {
		mgd = 0;
		hten = "";
		ngay = "";
		tthai = false;
	}
	public GDich(int m, String ht, String n, boolean tt) {
		mgd = m;
		hten = ht;
		ngay = n;
		tthai = tt;
	}
	public GDich(GDich gd) {
		mgd = gd.mgd;
		hten = gd.hten;
		ngay = gd.ngay;
		tthai= gd.tthai;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so giao dich: ");
		mgd = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ho ten: ");
		hten = sc.nextLine();
		System.out.println("Nhap ngay-thang-nam: ");
		ngay = sc.nextLine();
		System.out.println("Nhap trang thai giao dich (true/false): ");
		tthai = sc.nextBoolean();
	}
	public void in() {
		System.out.println("Ma giao dich: " + mgd);
		System.out.println("Ho ten: " + hten);
		System.out.println("Ngay giao dich: " + ngay);
		System.out.println("Trang thai: " + (tthai ? "Thanh cong" : "That bai"));
	}
}
