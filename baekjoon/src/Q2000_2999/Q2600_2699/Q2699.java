package Q2000_2999.Q2600_2699;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q2699{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int computerQuantity = Integer.parseInt(sc.nextLine());
		int network = Integer.parseInt(sc.nextLine());
		HashMap<Integer, Computer> computers = new HashMap<Integer, Computer>();
		for(int i = 1; i <= computerQuantity; i++) {
			computers.put(i, new Computer());
		}
		for(int i = 0; i < network; i++) {
			StringTokenizer st = new StringTokenizer(sc.nextLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			computers.get(first).network.add(second);
			computers.get(second).network.add(first);
		}
		sc.close();
		Stack<Integer> stack = new Stack<Integer>();
		int virusComputer = -1;
		stack.push(1);
		computers.get(1).visitFlag = true;
		while(!stack.isEmpty()) {
			int currentComputer = stack.pop();
			virusComputer++;
			Computer com = computers.get(currentComputer);
			if(com.network.size() != 0) {
				for(int i = 0; i < com.network.size(); i++) {
					if(!computers.get(com.network.get(i)).visitFlag ) {
						stack.push(com.network.get(i));
						computers.get(com.network.get(i)).visitFlag = true;
						
					}
				}
			}
		}
		System.out.println(virusComputer);
	}
	public static class Computer {
		boolean visitFlag = false;
		LinkedList<Integer> network = new LinkedList<Integer>();
	}
}
