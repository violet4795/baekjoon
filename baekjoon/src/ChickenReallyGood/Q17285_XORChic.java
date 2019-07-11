package ChickenReallyGood;

import java.util.Scanner;

public class Q17285_XORChic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String after = sc.nextLine();
		sc.close();
		StringBuffer sb = new StringBuffer().append("CHICKENS");
		char key = (char) (after.charAt(0)^'C');
		for(int i = 8; i < after.length(); i++) {
			sb.append(Character.toString((char) (after.charAt(i)^key)));
		}
		System.out.println(sb.toString());
	}
}
