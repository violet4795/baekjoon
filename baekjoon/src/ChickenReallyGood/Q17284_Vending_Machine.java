package ChickenReallyGood;

import java.util.Scanner;

public class Q17284_Vending_Machine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cal = 5000;
		int type = 0;
		String s = sc.nextLine();
		for(int i = 0; i < s.split(" ").length; i++) {
			type = Integer.parseInt(s.split(" ")[i]);
			switch(type) {
			case 1:
				cal -= 500;
				break;
			case 2:
				cal -= 800;
				break;
			case 3:
				cal -= 1000;
				break;
			}
		}
		sc.close();
		System.out.println(cal);
	}
}
