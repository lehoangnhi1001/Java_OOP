package advance.dev;

import advance.dev.Circle;
import advance.dev.Rectange;
import advance.dev.Triangle;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//hình tròn
				Circle circle = new Circle();
				circle.xuatTen();
				circle.nhapBK();
				circle.tinhChuVi();
				circle.tinhDienTich();
				circle.inChuVi();
				circle.inDienTich();
				
				//hình tam giác
				Triangle triangle = new Triangle();
				triangle.xuatTen();
				triangle.nhapA();
				triangle.nhapH();
				triangle.tinhChuVi();
				triangle.tinhDienTich();
				triangle.inChuVi();
				triangle.inDienTich();
				
				//hình chữ nhật
				Rectange rectange = new Rectange();
				rectange.xuatTen();
				rectange.nhapChieuDai();
				rectange.nhapChieuRong();
				rectange.tinhChuVi();
				rectange.tinhDienTich();
				rectange.inChuVi();
				rectange.inDienTich();
			}
	}


