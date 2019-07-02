package tier1_2;

import java.util.Scanner;

public class Q1003 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int testCaseNum = Integer.parseInt(sc.nextLine());
		
		
		int[][] fiboArray = new int[41][2];
		fiboArray[0] = new int[]{1, 0};
		fiboArray[1] = new int[]{0, 1};
		for(int i = 2; i < fiboArray.length; i++) {
			fiboArray[i] = new int[] {fiboArray[i-2][0] + fiboArray[i-1][0], fiboArray[i-2][1] + fiboArray[i-1][1]};
		}
		
		int testNum = 0;
		for (int i = 0; i < testCaseNum; i++) {
			testNum = Integer.parseInt(sc.nextLine());
			System.out.println(fiboArray[testNum][0] + " " + fiboArray[testNum][1]);
		}
		sc.close();
	}


}
