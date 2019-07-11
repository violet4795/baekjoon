package Q1000_1999.Q1000_1099;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//대망의 습격자 초라기

public class Q1006 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//입력 10000개할수도있다..
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		int testCase = Integer.parseInt(bf.readLine());
		for(int testIndex = 0; testIndex < testCase; testIndex++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int zone = Integer.parseInt(st.nextToken());
			final int fbi = Integer.parseInt(st.nextToken());
			int[][] wonTaGon = new int[zone][2];
			for(int i = 0; i < 2; i ++) {
				st = new StringTokenizer(bf.readLine());
				for(int j = 0; j < zone; j++) {
					wonTaGon[j][i] = Integer.parseInt(st.nextToken());
				}
			}
			for(int i = 0; i < 2; i ++) {
				for(int j = 0; j < zone; j++) {
					System.out.print(wonTaGon[j][i] + " ");
				}
				System.out.println();
			}
			int reference = 0;
			for(int i = 0; i < 2; i ++) {
				for(int j = 0; j < zone; j++) {
					reference = 0;
					if(j == zone-1) {
						if(wonTaGon[j][i] + wonTaGon[0][i] <= fbi) {
							reference++;
						}
					}else {
						if(wonTaGon[j][i] + wonTaGon[j+1][i] <= fbi) {
							reference++;
						}
					}
					
					if(i == 0) {
						if(wonTaGon[j][i] + wonTaGon[j][i] <= fbi) {
							reference++;
						}
					}else {
						
					}
					
					
					if(j == 0) {
						if(wonTaGon[j][i] + wonTaGon[zone-1][i] <= fbi) {
							reference++;
						}
					}else {
						if(wonTaGon[j][i] + wonTaGon[j-1][i] <= fbi) {
							reference++;
						}
					}
					
				}
			}
			
			
			
		}
		bf.close();
		
	}
}
