package tier1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		char[] alphabet = new char[26];
		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) (i+97);
		}
		boolean a;
		for(int i = 0; i < 26; i++) {
			a = false;
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == alphabet[i]) {
					System.out.print(j+ " ");
					a = !a;
					break;
				}
			}
			if(!a) {
				System.out.print(-1 + " ");
			}
		}
	}
}
