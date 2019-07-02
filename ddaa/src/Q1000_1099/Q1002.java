package Q1000_1099;

import java.util.Scanner;

//turret

public class Q1002 {
	//3
	//0 0 13 40 0 37
	//0 0 3 0 7 4
	//1 1 1 1 1 5
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < testCase; i++) {
			System.out.println(turretCalc(sc.nextInt(), sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
			
		}
		sc.close();
	}
	public static int turretCalc(int x1, int y1, int r1, int x2, int y2, int r2) {
		double distance = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		if(distance == 0) {
			if(r1 == r2) {
				return -1;
			}else {
				return 0;
			}
		}else if(r1 == r2 + distance || r2 == r1 + distance || r1 + r2 == distance) {
			return 1;
		}else if(r1 + r2 < distance) {
			return 0;
		}else if(r1 > r2 + distance || r2 > r1 + distance){
			return 0;
		}else {
			return 2;
		}
	}
}
