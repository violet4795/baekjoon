package Q2000_2999.Q2400_2499;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q2448 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int[][] numArray = new int[num+1][num*2+1+1];
		for(int i = 1; i <= num; i++) {
			
			if(i % 3 == 1) {
				if( i == 1) {
					numArray[i][num] = 1;
				} else {
					for(int j = 1; j <= numArray[i-1].length-1; j++) {
						if(numArray[i-1][j] == 1 && numArray[i-1][j-1] == 0) {
							if(numArray[i][j-1] == 1) {
								numArray[i][j-1] = 0;
							}else {
								numArray[i][j-1] = 1;
							}
						}
						if(numArray[i-1][j] == 1 && numArray[i-1][j+1] == 0) {
							if(numArray[i][j+1] == 0) {
								numArray[i][j+1] = 1;
							}else {
								numArray[i][j+1] = 0;
							}
						}
					}
				}
					
				/*if(3*(int)Math.pow(2, levelFlag) == i){
					numArray[i][num-i+1] = 1;
					numArray[i][num+i-1] = 1;
				} else {
					for(int j = 1; j <= numArray[i-1].length; j++) {
						if(numArray[i-1][j] == 1) {
							numArray[i][j-1] = 1;
							numArray[i][j-1+(3*(int)Math.pow(2, grade))] = 1;
							j += 3*(int)Math.pow(2, grade);
						}
					}
				}
				*/
			}
			if(i % 3 == 2) {
				for(int j = 1; j <= numArray[i-1].length-1; j++) {
					if(numArray[i-1][j] == 1) {
						numArray[i][j-1] = 1;
						numArray[i][j+1] = 1;
					}
				}
			}
			if(i % 3 == 0) {
				for(int j = 1; j <= numArray[i-1].length-1; j++) {
					if(numArray[i-1][j] == 1) {
						for(int k = 0; k < 5; k++) {
							numArray[i][j-1] = 1;
							j++;
						}
					}
				}
			}
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
		for(int i = 1; i <= numArray.length-1; i++) {
			for(int j = 1; j <= numArray[i].length-1; j++) {
				if(numArray[i][j] == 1) {
					bw.write("*");
				}else {
					bw.write(" ");
				}
			}
			bw.write("\n");
		}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
}
