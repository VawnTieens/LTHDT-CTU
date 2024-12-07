package buoi5;

import java.util.HashMap;
import java.util.Scanner;

public class ChuyenXe extends Xe {
	private int msc;
	private String tenlx;
	private String nden;
	private double dthu;
	
	public ChuyenXe() {
		super();
		msc = 0;
		tenlx = "";
		nden = "0";
		dthu = 0.0;
	}
	public ChuyenXe(ChuyenXe cx) {
		msc = cx.msc;
		tenlx = cx.tenlx;
		nden = cx.nden;
		dthu = cx.dthu;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so chuyen xe: ");
		msc = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten nguoi lai xe: ");
		tenlx = sc.nextLine();
		System.out.println("Nhap noi den: ");
		nden = sc.nextLine();
		System.out.println("Nhap doanh thu: ");
		dthu = sc.nextDouble();
	}
	public void in() {
		super.in();
		System.out.println("Ma so chuyen xe: " + msc);
		System.out.println("Ten nguoi lai xe: "  + tenlx);
		System.out.println("Noi den: " + nden);
		System.out.println("Doanh thu: " + dthu);
	}
	public double getDoanhThu() {
		return dthu;
	}
	public String getThangNam() {
        String[] parts = this.getNgayDangKiem().split("/");
        return parts[1] + "/" + parts[2];
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Danh sach chuyen xe");
		int m = sc.nextInt();
		ChuyenXe[] ds1 = new ChuyenXe[m];
		for (int i=0; i<m; i++) {
			ds1[i] = new ChuyenXe();
			ds1[i].nhap();
		} for (int i=0; i<m; i++) {
			ds1[i].in();
		}
		
		System.out.println("\nTat ca chuyen xe bi huy hoac doanh thu duoi 100000:");
        for (ChuyenXe cx : ds1) {
            if (cx.getDoanhThu() < 100000) {
                System.out.println("Ma chuyen xe: " + cx.msc);
            }
        }

        // Tính tổng lợi nhuận cho từng loại xe theo tháng/năm
        System.out.println("\nTong loi nhuan cho tung loai xe theo thang-nam:");

        // Sử dụng HashMap để nhóm theo loại xe và tháng-năm
        HashMap<String, Double> doanhThuTheoLoaiVaThangNam = new HashMap<>();

        for (ChuyenXe cx : ds1) {
            String key = cx.getLoaiXe() + " - " + cx.getThangNam();
            doanhThuTheoLoaiVaThangNam.put(key, doanhThuTheoLoaiVaThangNam.getOrDefault(key, 0.0) + cx.getDoanhThu());
        }

        // Hiển thị kết quả tổng doanh thu
        for (String key : doanhThuTheoLoaiVaThangNam.keySet()) {
            System.out.println(key + ": " + doanhThuTheoLoaiVaThangNam.get(key));
        }
    }
}
