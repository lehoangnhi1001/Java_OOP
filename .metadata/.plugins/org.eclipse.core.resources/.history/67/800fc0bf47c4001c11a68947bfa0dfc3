package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IShape shapeManager = new ShapeManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 2 hình tròn");
		for (int i = 0; i < 2; i++) {
			System.out.println("Nhập vào bán kính: ");
			double radius = sc.nextDouble();
			sc.nextLine();
			shapeManager.add(new Circle("Circle: " + radius));
		}
		
		System.out.println("Nhập vào 2 hình chữ nhật");
		for (int i = 0; i < 2; i++) {
			System.out.println("Nhập vào cạnh a: ");
			double a = sc.nextDouble();
			sc.nextLine();
			

			System.out.println("Nhập vào cạnh b: ");
			double b = sc.nextDouble();
			sc.nextLine();
			
			shapeManager.add(new Rectangle("Rectangle: " + a, a, b));
		}
		

		System.out.println("Nhập vào 1 hình tam giác");
		System.out.println("Nhập vào cạnh a: ");
		double a = sc.nextDouble();
		sc.nextLine();
		

		System.out.println("Nhập vào cạnh b: ");
		double b = sc.nextDouble();
		sc.nextLine();

		System.out.println("Nhập vào cạnh c: ");
		double c = sc.nextDouble();
		sc.nextLine();
		
		shapeManager.add(new Triangle("Triangle: " + a, a, b, c));
		
		System.out.println("Thông tin mảng shape vừa nhập");
		shapeManager.print();
	}
	
}
