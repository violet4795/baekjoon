package Q11000_11999.Q11700_11799;

import java.util.Scanner;

public class Q11726 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		sc.close();
		int[] sq = new int[n];
		/*for(int i = 0; i < n; i++) {
			if(i == 0) {
				sq[i] = 1;
			}else if(i == 1) {
				sq[i] = 2;
			}else {
				sq[i] = sq[i-1] + sq[i-2];
			}
		}*/
		if(n > 2) {
			sq[0] = 1;
			sq[1] = 2;
			for(int i = 2; i < n; i++) {
				sq[i] = sq[i-1]%10007 + sq[i-2]%10007;
			}
		}else if(n == 2) {
			sq[1] = 2;
		}else {
			sq[0] = 1;
		}
		System.out.println(sq[n-1]%10007);
	}
}
