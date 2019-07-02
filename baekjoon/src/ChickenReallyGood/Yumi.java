package ChickenReallyGood;

import java.util.Scanner;

public class Yumi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yumiX = sc.nextInt();
		int yumiY = sc.nextInt();
		sc.nextLine();
		int[][] user = new int[3][2];
		for(int i = 0; i < 3; i++) {
			user[i][0] = sc.nextInt();
			user[i][1] = sc.nextInt();
			sc.nextLine();
		}
		sc.close();
		double minDistance = 100;
		double current = 0; 
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(j == i) {
					continue;
				}else {
					int k = 3-i-j;
					current = Math.sqrt(Math.pow(yumiX-user[i][0], 2) + Math.pow(yumiY-user[i][1], 2));
					current += Math.sqrt(Math.pow(user[i][0]-user[j][0], 2) + Math.pow(user[i][1]-user[j][1], 2));
					current += Math.sqrt(Math.pow(user[j][0]-user[k][0], 2) + Math.pow(user[j][1]-user[k][1], 2));
					if(minDistance > current) {
						minDistance = current;
					}
				}
			}
		}
		System.out.println((int)minDistance);
		
		
	}
}
