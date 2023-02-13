package piramityildiz;

import java.util.Scanner;

public class yildizPiramit {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("İstenilen satır sayisini giriniz = ");
		int sayi = scan.nextInt();
		
		for(int x = 1 ; x<=sayi ; x++) {
			for(int y = x ; y < sayi ; y++) {
				System.out.print(" ");
				
			}
			for(int z = 1 ; z<2*x ; z++) {
				System.out.print("*");
				
			}System.out.println();
		}
		for(int x = sayi- 1 ; x>=1 ; x--) {
			for(int y = sayi ; y > x ; y--) {
				System.out.print(" ");
			}for (int z = 1 ; z<2*x ; z++) {
			System.out.print("*");
			}
			System.out.println();
		}

	}

}
