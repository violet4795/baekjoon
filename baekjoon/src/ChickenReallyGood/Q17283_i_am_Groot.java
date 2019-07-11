package ChickenReallyGood;

import java.util.Scanner;

public class Q17283_i_am_Groot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int allPlant = Integer.parseInt(sc.nextLine());
		int ratio = Integer.parseInt(sc.nextLine());
		sc.close();
		int treeHeight = 0;
		for(int i = 2; ; i *= 2) {
			allPlant = (int)((double)ratio/100*(double)allPlant);
			if(allPlant > 5) {
				treeHeight += (allPlant)*i;
			}else {
				break;
			}
			
		}
		System.out.println(treeHeight);
	}
}
