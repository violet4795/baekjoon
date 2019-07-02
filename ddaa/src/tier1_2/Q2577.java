package tier1_2;

import java.util.Scanner;

public class Q2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		long x = a*b*c;
		int count;
		for(int o = 48; o < 58; o ++) {
			count = 0;
			for(int i = 0; i < String.valueOf(x).length(); i++) {
				int y = (int)String.valueOf(x).charAt(i);
				if(o == y) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
