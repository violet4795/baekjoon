package Q10000_10999.Q10000_10099;

import java.util.Scanner;

public class Q10039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		for(int i = 0; i < 5; i++) {
			num = sc.nextInt();
			if(num < 40) {
				num = 40;
			}
			sum += num;
		}
		System.out.println(sum/5);
		sc.close();
		
	}
}
