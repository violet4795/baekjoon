package ChickenReallyGood;

import java.util.Scanner;

public class Enigma {
	public static void main(String[] args) {
		Enigma eni = new Enigma();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		//WINTERISCOMINGJOHNSNOW
		//CHICKENS
		eni.enigma("CE", s);
	}
	public void enigma(String key, String s) {
		StringBuilder sb = new StringBuilder();
		char firstGear = 'C';
		for(int i = 0; i < s.length(); i++) {
			sb.append(gear(gear(firstGear, s.charAt(i)), 'E'));
			firstGear ++;
			if(firstGear == '[') {
				firstGear = 'A';
			}
		}
		System.out.println(sb.toString());
	}
	public char gear(char start, char current) {
		if(start-64 + current-64 >= 26) {
			return (char) (start-64+current-64-26-1+64);
		}else {
			return (char) (start-64+current-64-1+64);
		}
	}
}
