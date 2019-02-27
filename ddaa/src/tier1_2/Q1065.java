package tier1_2;

import java.util.Scanner;

public class Q1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int answer = 0;
		int x, y, z = 0;
		
		for(int i = 1; i <= num; i++) {
			x = i;
			y = x%10;
			x /= 10;
			z = x%10;
			x /= 10;
			for(int j = x; j != 0; j /= 10) {
				if(y - z != z - j) {
					answer --;
					break;
				}
			}
			answer++;
		}
		System.out.println(answer);
		sc.close();
	}
}
