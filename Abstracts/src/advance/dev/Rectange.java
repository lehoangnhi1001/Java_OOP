package advance.dev;

import java.util.Scanner;

public class Rectange extends hinh {
	float dai;
	float rong;
	
	public Rectange() {
		ten = "Hình Chữ Nhật";
	}
	public void nhapChieuDai() {
        System.out.println("Chiều dài = ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    }
 
    public void nhapChieuRong() {
        System.out.println("Chiều rộng = ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }
 
    public void tinhChuVi() {
        chuVi = 2 * (dai + rong);
    }
 
    public void tinhDienTich() {
        dienTich = dai * rong;
    }
}
