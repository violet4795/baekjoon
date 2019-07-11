package Q1000_1999.Q1000_1099;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1094 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> treePart = new ArrayList<Integer>();
		int tree = 64;
		int sum = 0;
		int tree1 = 0;
		int tree2 = 0;
		treePart.add(tree);
		while(true) {
			sum = 0;
			for(int x : treePart) {
				sum += x;
			}
			if(sum == num) {
				System.out.println(treePart.size());
				break;
			}
			sum = 0;
			tree1 = treePart.get(treePart.size()-1)/2;
			tree2 = treePart.get(treePart.size()-1)/2;
			treePart.remove(treePart.size()-1);
			for(int x : treePart) {
				sum += x;
			}
			if((sum + tree1) >= num) {
				treePart.add(tree1);
			}else {
				treePart.add(tree1);
				treePart.add(tree2);
			}
		}
		sc.close();
	}
}
