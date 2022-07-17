package Bai3;

import java.util.*;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		int sum = n;
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0)
			sum += i;
		}
		System.out.println("Tong cac uoc cua n la " + sum);
	}

}
