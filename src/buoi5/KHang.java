package buoi5;

import java.util.Scanner;

public class KHang {
	private String ten;
	private boolean gtinh; //true M, false FM
	private int nsinh;
	
	//cac phuong thuc xay dung
	public KHang() {
		ten = "Nguyen Van An";
		gtinh = true;
		nsinh = 1980;
	}
	public KHang (String t, boolean gt, int ns) {
		ten = t;
		gtinh = gt;
		nsinh = ns;
	}
	public KHang(KHang k) {
		ten = k.ten;
		gtinh = k.gtinh;
		nsinh = k.nsinh;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		ten = sc.nextLine();
		System.out.println("Nhap gioi tinh (true-Nam, false-Nu): ");
		gtinh = sc.nextBoolean();
		System.out.println("Nhap nam sinh: ");
		nsinh = sc.nextInt();
	}
	public void in() {
		System.out.println(ten +"/"+gtinh+"/"+nsinh);
	}
}
