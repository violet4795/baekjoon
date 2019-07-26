package Q2000_2999.Q2700_2799;

import java.util.Scanner;

//blackjack
public class Q2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cardQuantity = sc.nextInt();
		int jackNumber = sc.nextInt();
		sc.nextLine();
		int[] cards = new int[cardQuantity];
		for(int i = 0; i < cardQuantity; i++) {
			cards[i] = sc.nextInt();
		}
		sc.close();
		int current = -1;
		for(int i = 0; i < cards.length; i++) {
			for(int j = i+1; j < cards.length; j++) {
				for(int k = j+1; k < cards.length; k++) {
					if(cards[i] + cards[j] + cards[k] == jackNumber) {
						System.out.println(jackNumber);
						return;
					}else {
						if((jackNumber - current) > (jackNumber - (cards[i] + cards[j] + cards[k])) && (cards[i] + cards[j] + cards[k]) < jackNumber){
							current = cards[i] + cards[j] + cards[k];
						}
					}
				}
			}
		}
		System.out.println(current);
	}
}
