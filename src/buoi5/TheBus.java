package buoi5;

import java.util.Scanner;

public class TheBus {
	private String maThe;
	private String nph; // dd/mm/yy
	private char loai;
	private KHang k;// mot the bus thuoc ve 1 khach hang

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
		System.out.println("Nhap nph (dd/mm/yy): ");
		nph = sc.nextLine();
		System.out.println("Nhap loai the(Y-year, M-month, D-Date): ");
		loai = sc.nextLine().charAt(0);
		System.out.println("Nhap khach hang: ");
		k.nhap();
	}

	public void in() {
		System.out.println(maThe + " - " + nph + " - " + loai);
		k.in();
	}

	public char getLoai() {
		return loai;
	}

	public String getNPH() {
		return nph;
	}

	public KHang getKHang() {
		return k;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong the bus: ");
		int m = sc.nextInt();
		TheBus[] ds = new TheBus[m];
		for (int i = 0; i < m; i++) {
			ds[i] = new TheBus();
			ds[i].nhap();
		}
		for (int i = 0; i < m; i++) {
			ds[i].in();
		}
		//liet ke the co gia tri sd 1 nam 'Y'
		System.out.println("The co loai su dung 1 nam: ");
		for(int i=0; i<m; i++) {
			if(ds[i].getLoai()=='Y')
				ds[i].in();
		}
		//liet ke khach hang, the phat hanh ngay 20/05/22
		System.out.println("Khach hang co the phat hanh ngay 20/05/22: ");
		for(int i=0; i<m; i++) {
			if(ds[i].getNPH().equals("20/05/22")) {
				ds[i].getKHang().in();
			}
		}
	}
}
