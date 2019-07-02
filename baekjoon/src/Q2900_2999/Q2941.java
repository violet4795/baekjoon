package Q2900_2999;

import java.util.Scanner;

public class Q2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String croAlphabet = sc.nextLine();
		sc.close();
		int count = croAlphabet.length();
		for (int i = 0; i < croAlphabet.length() - 1; i++) {
			switch (croAlphabet.substring(i, i + 2)) {
			case "c=":
				count--;
				break;
			case "c-":
				count--;
				break;
			case "d-":
				count--;
				break;
			case "dz":
				if (i != croAlphabet.length() - 2) {
					if (croAlphabet.substring(i, i + 3).equals("dz=")) {
						count -= 2;
						i += 1;
					}
				}
				break;
			case "lj":
				count--;
				break;
			case "nj":
				count--;
				break;
			case "s=":
				count--;
				break;
			case "z=":
				count--;
				break;
			}

		}
		System.out.println(count);
	}
}
