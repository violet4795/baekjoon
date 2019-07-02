package tier1_2;

import java.util.Scanner;

public class Q12100 {
	static int max = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		max = Integer.parseInt(sc.nextLine());
		int[][] game2048 = new int[max][max];
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < max; j++) {
				game2048[i][j] = sc.nextInt();
			}
			sc.nextLine();
		}
		sc.close();
		for(int i = 0; i < 5; i++) {
			for(int a = 0; a < 4; a ++) {
				for(int b = 0; b < 4; b++) {
					for(int c = 0; c < 4; c++) {
						for(int d = 0; d < 4; d++) {
							for(int e = 0; e < 4; e++) {
								
							}
						}
					}
				}
			}
		}
	}
	
	public void draft(int[][] array2048, int direction) {
		switch(direction) {
		case 0: // draft left
			int current = 0;
			for(int i = 0; i < max; i++) {
				current = 0;
				for(int j = 1; j < max; j++) {
					if(array2048[i][current] == 0) {
						array2048[i][current] = array2048[i][j]; 
						array2048[i][j] = 0;
					}else {
						if(array2048[i][j] == 0) {
							
						}else if(array2048[i][current] == array2048[i][j]) {
							array2048[i][current] = array2048[i][current] + array2048[i][j];
							array2048[i][j] = 0;
							current ++;
						}else {
							current ++;
						}
					}
				}
			}
			break;
		case 1:
			break;
		}
	}
}

