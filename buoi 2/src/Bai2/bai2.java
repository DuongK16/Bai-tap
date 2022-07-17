package Bai2;

import java.util.*;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a;
		System.out.println("Nhap a:");
		a = sc.nextInt();
		int b;
		System.out.println("Nhap b:");
		b = sc.nextInt();
		int c;
		System.out.println("Nhap c:");
		c = sc.nextInt();
		if(a + b > c && b + c > a && a + c > b) {
			if(a == b && b == c)
				System.out.println("Tam giac deu");
			else if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b) {
				if(a + b == 14)
					System.out.println("Tam giac vuong can");
				else
					System.out.println("Tam giac vuong");
			}
			else
				System.out.println("Tam giac thuong");
		}
		else
			System.out.println("Khong the tao thanh tam giac");
	}
}
