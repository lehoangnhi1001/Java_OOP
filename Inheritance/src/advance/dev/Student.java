package advance.dev;

import java.util.Scanner;

public class Student extends Person {
	float diemtoan, diemly, diemhoa;
	int masv, lop;
	double dtb;
	
	void NhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sv: ");
		this.masv = sc.nextInt();
		
		System.out.println("Nhập lớp: ");
		this.lop = sc.nextInt();
		
		System.out.println("Nhập điểm toán: ");
		this.diemtoan = sc.nextInt();
		
		System.out.println("Nhập điểm lý: ");
		this.diemly = sc.nextInt();
		
		System.out.println("Nhập điểm hóa: ");
		this.diemhoa = sc.nextInt();
		
	}
	void XuatDiem() {
		System.out.println("Mã sv: " + this.masv + "Lớp: " + this.lop +"Điểm Toán: " + this.diemtoan + "Điểm Lý: " + this.diemly + "Điểm Hóa: " + this.diemhoa + "ĐTB:" + (diemtoan+diemly+diemhoa)/3);
	}
}
