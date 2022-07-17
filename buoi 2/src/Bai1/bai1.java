package Bai1;

import java.util.*;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap ngay sinh: ");
		int n;
		n = sc.nextInt();
		System.out.println("Nhap thang sinh: ");
		int t;
		t = sc.nextInt();
		switch (t) {
		case 1:
			if(1 <= n && n <= 19)
				System.out.println("Ma Ket");
			else if(n >= 20 && n <= 31)
				System.out.println("Bao Binh");
			else
				System.out.println("Ngay khong hop le");
			break;
		case 2:
			if(1 <= n && n <= 18)
				System.out.println("Bao Binh");
			else if(n >= 19 && n <= 29)
				System.out.println("Song Ngu");
			else
				System.out.println("Ngay khong hop le");
			break;
		case 3:
			if(1 <= n && n <= 20)
				System.out.println("Song Ngu");
			else if(n >= 21 && n <= 31)
				System.out.println("Bach Duong");
			else
				System.out.println("Ngay khong hop le");
			break;
		case 4:
			if(1 <= n && n <= 20)
				System.out.println("Bach Duong");
			else if(n >= 21 && n <= 30)
				System.out.println("Kim Nguu");
			else
				System.out.println("Ngay khong hop le");
			break;
		case 5:
			if(1 <= n && n <= 20)
				System.out.println("Kim Nguu");
			else if(n >= 21 && n <= 31)
				System.out.println("Song Tu");
			else
				System.out.println("Ngay khong hop le");
			break;
		case 6:
			if(1 <= n && n <= 21)
				System.out.println("Song Tu");
			else if(n >= 22 && n <= 30)
				System.out.println("Cu Giai");
			else
				System.out.println("Ngay khong hop le");
			break;
		case 7:
			if(1 <= n && n <= 22)
				System.out.println("Cu Giai");
			else if(n >= 23 && n <= 31)
				System.out.println("Su Tu");
			else
				System.out.println("Ngay khong hop le");
			break;
		case 8:
			if(1 <= n && n <= 22)
				System.out.println("Su Tu");
			else if(n >= 23 && n <= 31)
				System.out.println("Xu Nu");
			else
				System.out.println("Ngay khong hop le");
			break;
		case 9:
			if(1 <= n && n <= 22)
				System.out.println("Xu Nu");
			else if(n >= 3 && n <= 30)
				System.out.println("Thien Binh");
			else
				System.out.println("Ngay khong hop le");
			break;
		case 10:
			if(1 <= n && n <= 23)
				System.out.println("Thien Binh");
			else if(n >= 24 && n <= 31)
				System.out.println("Bo Cap");
			else
				System.out.println("Ngay khong hop le");
			break;
		case 11:
			if(1 <= n && n <= 22)
				System.out.println("Bo Cap");
			else if(n >= 23 && n <= 30)
				System.out.println("Nhan Ma");
			else
				System.out.println("Ngay khong hop le");
			break;
		case 12:
			if(1 <= n && n <= 21)
				System.out.println("Nhan Ma");
			else if(n >= 22 && n <= 31)
				System.out.println("Ma Ket");
			else
				System.out.println("Ngay khong hop le");
			break;
		default:
			System.out.println("Thang khong hop le");
		}
	}
}
