package ChickenReallyGood;

import java.util.Scanner;

public class The_Deeper_The_Better {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		int depth = 0;
		int max = 0;
		for(int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			switch(x) {
			case '(':
				depth ++;
				break;
			case '{':
				depth += 2;
				break;
			case '[':
				depth += 3;
				break;
			case ')':
				depth --;
				break;
			case '}':
				depth -= 2;
				break;
			case ']':
				depth -= 3;
				break;
				default:
					if(max < depth) {
						max = depth;
					}
			}
		}
		System.out.println(max);
		
	}
	
	//(1)[{3(5)}((4))]
}
