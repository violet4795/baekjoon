package tier1_2;

import java.util.Scanner;

public class Q8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int count, sum = 0;
		for(int i = 0; i < num; i++) {
			String s = sc.nextLine();
			count = 0;
			sum = 0;
			for(int j = 0; j < s.length(); j++) {
				if('O' == s.charAt(j)) {
					count++;
					sum += count;
				}else {
					count = 0;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
