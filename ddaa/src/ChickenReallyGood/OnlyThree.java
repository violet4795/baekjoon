package ChickenReallyGood;

import java.util.Scanner;

public class OnlyThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		int maxResult = 0;
		String threeNumber = "";
		int current = 0;
		int before = -2;
		for(int i = 0; i < s.length(); i++) {
			current = Integer.parseInt(String.valueOf(s.charAt(i)));
			if(i == s.length()-1 && (before + 1 == current)) {
				threeNumber += String.valueOf(current);
			}
			if((before != -2 && (before + 1 != current)) || i == s.length()-1){
				if(threeNumber.length() == 3) {
					maxResult++;
				}
				threeNumber = "";
			}
			threeNumber += String.valueOf(current);
			before = current;
		}
		System.out.println(maxResult);
	}
}
