package buoi5;

import java.util.Scanner;

public class TheBus {
	private String maThe;
	private String nph;
	private char loai;
	private KHang k;

	public TheBus() {
		maThe = "";
		nph = "01/01/01";
		loai = 'H';
		k = new KHang();
	}

	public TheBus(String mt, String n, char l, KHang a) {
		maThe = mt;
		nph = n;
		loai = l;
		k = new KHang(a);
	}

	public TheBus(TheBus b) {
		maThe = b.maThe;
		nph = b.nph;
		loai = b.loai;
		k = new KHang(b.k);
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma the: ");
		maThe = sc.nextLine();
		System.out.println("Nhap ngay phat hanh the(dd/mm/yy): ");
		nph = sc.nextLine();
		System.out.println("Nhap loai the(H-hour, D-date, M-month, Y-year): ");
		loai = sc.nextLine().charAt(0);
		System.out.println("Nhap khach hang: ");
		k.nhap();
	}

	public void in() {
		System.out.println("Ma the: " + maThe);
		System.out.println("Ngay phat hanh: " + nph);
		System.out.println("Loai the: " + loai);
		k.in();
	}

	public char getLoai() {
		return loai;
	}

	public String getNPH() {
		return nph;
	}

	public KHang getKhachHang() {
		return k;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong the bus");
		int m = sc.nextInt();
		TheBus[] ds1 = new TheBus[m];
		for (int i = 0; i < m; i++) {
			ds1[i] = new TheBus();
			ds1[i].nhap();
		}
		for (int i = 0; i < m; i++) {
			ds1[i].in();
		}

		System.out.println("\nThe bus co loai su dung 1 nam: ");
		for (int i = 0; i < m; i++) {
			if (ds1[i].getLoai() == 'Y') {
				ds1[i].in();
			} else {
				System.out.println("Khong co!");
				sc.nextLine();
			}
		}

		System.out.println("\nKhach hang co the phat hanh ngay 20/05/22: ");
		for (int i = 0; i < m; i++) {
			if (ds1[i].getNPH().equals("20/05/22")) {
				ds1[i].getKhachHang().in();
			} else {
				System.out.println("Khong co!");
				sc.nextLine();
			}
		}
	}
}

