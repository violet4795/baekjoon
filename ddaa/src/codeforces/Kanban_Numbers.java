package codeforces;

import java.util.Random;
import java.util.Scanner;

public class Kanban_Numbers {
	//what is kanban_numbers??
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.nextLine());
		Random rand = new Random();
		if(rand.nextBoolean()) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		sc.close();

	}
}
