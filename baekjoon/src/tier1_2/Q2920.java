package tier1_2;

import java.util.Scanner;

public class Q2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int preInt = sc.nextInt();
		boolean flag ;
		if(preInt == 8) {
			flag = true;
		}else if(preInt == 1) {
			flag = false;
		}else {
			System.out.println("mixed");
			return;
		}
		for(int i = 0; i < 7; i++) {
			int x = sc.nextInt();
			if(((preInt-1) == x) && flag) {
				 preInt = x;
			}else if(((preInt+1) == x) && !flag) {
				preInt = x;
			}else {
				System.out.println("mixed");
				return;
			}
		}
		if(flag) {
			System.out.println("descending");
		}else {
			System.out.println("ascending");
		}
		sc.close();
	}
}
