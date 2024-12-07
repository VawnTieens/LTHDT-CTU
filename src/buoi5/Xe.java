package buoi5;

import java.util.Scanner;

public class Xe {
	private String soxe;
	private String loai;
	private String ngay;
	private boolean tthai;

	public Xe() {
		soxe = "";
		loai = "";
		ngay = "";
		tthai = false ;
	}
	public Xe(Xe x) {
		soxe = x.soxe;
		loai = x.loai;
		ngay = x.ngay;
		tthai = x.tthai;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so xe: ");
		soxe = sc.nextLine();
		System.out.println("Nhap loai xe: ");
		loai = sc.nextLine();
		System.out.println("Nhap ngay(dd/mm/yy) dang kiem: ");
		ngay = sc.nextLine();
		System.out.println("Trang thai luu hanh(true-co, false-khong): ");
		tthai = sc.nextBoolean();
	}
	public void in() {
		System.out.println("So xe: " + soxe);
		System.out.println("Loai xe: " + loai);
		System.out.println("Ngay dang kiem: " + ngay);
		System.out.println("Trang thai luu hanh: " + (tthai ? "Co" : "Khong"));
	}
	public boolean trangThaiLuuHanh() {
		return tthai;
	}
	public String getLoaiXe() {
        return loai;
    }
	protected String getNgayDangKiem() {
		return ngay;
	}
	public static void main(String[] args) {
		Xe x1 = new Xe();
		System.out.println("Nhap thong tin cho xe x1: ");
		x1.nhap();
		
		System.out.println("Thong tin cua xe x1: ");
		x1.in();
		
		Xe x2 = new Xe(x1);
		
		System.out.println("\nThong tin cua xe x2(sao chep tu xe x1): ");
		x2.in();
	}
}
