package pekidz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cislo;
		System.out.println("Cauko cauko daj cislo");
		cislo = sc.nextInt();
		
		if (cislo>0) {
			System.out.println("Ciselko " + cislo + " je kladne");
		} else {
			System.out.println("Ciselko " + cislo + " je zaporne");
		}
		
		
		
	}

}
