package Doit;

import java.util.Scanner;

public class 연습1_09 {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			while (a > b) {
				System.out.println("a보다 큰 값을 입력하세요!");
			    b = sc.nextInt();
			}
			
			System.out.println(b - a);
	}

}
