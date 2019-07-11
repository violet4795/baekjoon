package Q1000_1999.Q1100_1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Q1260 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vertex = sc.nextInt();
		int edge = sc.nextInt();
		int start = sc.nextInt();
		HashMap<Integer, ArrayList<Integer>> vertexEdge = new HashMap<Integer, ArrayList<Integer>>();
		boolean[] vertexCheck = new boolean[vertex+1];
		Arrays.fill(vertexCheck, false);
		int first;
		int second;
		for(int i = 0; i < edge; i++) {
			sc.nextLine();
			first = sc.nextInt();
			second = sc.nextInt();
			if(!vertexEdge.containsKey(first)) {
				vertexEdge.put(first, new ArrayList<Integer>());
				vertexEdge.get(first).add(second);
				if(!vertexEdge.containsKey(second)) {
					vertexEdge.put(second, new ArrayList<Integer>());
					vertexEdge.get(second).add(first);
				}else {
					ArrayList<Integer> vertexArr = vertexEdge.get(second);
					for(int j = 0; j < vertexArr.size(); j++) {
						if(first < vertexArr.get(j)) {
							vertexArr.add(j, first);
							break;
						}else if(j == vertexArr.size()-1){
							vertexArr.add(first);
							break;
						}
					}
					vertexEdge.put(second, vertexArr);
				}
			}else {
				ArrayList<Integer> vertexArr = vertexEdge.get(first);
				for(int j = 0; j < vertexArr.size(); j++) {
					if(second < vertexArr.get(j)) {
						vertexArr.add(j, second);
						break;
					}else if(j == vertexArr.size()-1){
						vertexArr.add(second);
						break;
					}
				}
				vertexEdge.put(first, vertexArr);
				if(!vertexEdge.containsKey(second)) {
					vertexEdge.put(second, new ArrayList<Integer>());
					vertexEdge.get(second).add(first);
				}else {
					vertexArr = vertexEdge.get(second);
					for(int j = 0; j < vertexArr.size(); j++) {
						if(first < vertexArr.get(j)) {
							vertexArr.add(j, first);
							break;
						}else if(j == vertexArr.size()-1){
							vertexArr.add(first);
							break;
						}
					}
					vertexEdge.put(second, vertexArr);
				}
			}
		}
		sc.close();
		int current = start;
		boolean flag = true;
		
		//System.out.println(vertexEdge.toString());
		
		
		Stack<Integer> vertexStack = new Stack<Integer>();
		vertexCheck[current] = true;
		vertexStack.push(current);
		System.out.print(current + " ");
		
		//dfs
		//���� stack�� �� start�� pop�ȴٸ� ��� ���ڸ� �� ��ȸ�ߴٰ� �����ִ�.
		while(!vertexStack.isEmpty()) {
			
			flag = true;
			// current�� ���ø����� ����
			current = vertexStack.peek();

			//current�� �ΰ��� ���� ������.
			//current�� �湮���� ���� �����ϰ��.
			//�湮�ѵ� pop���� �ٽ� ���ƿ� ���.
			//stack���� pop���ѵ� �ٽõ��ƿ°Ŷ�� �ɷ������ϱ⶧���� �����߰�
			if(!vertexCheck[current]) {
				vertexCheck[current] = true;
				vertexStack.push(current);
				System.out.print(current + " ");
			}
			
			// �� �ڽĵ� �߿��� �湮���� ���� ���ڸ� ã�� ���ÿ� �ִ´�.
			//���ٸ� pop

			ArrayList<Integer> arr = vertexEdge.get(current);
			// �Ѥ� ���������� ����� ��尡 ������쵵 �߰�;
			if(arr != null) {
				// �ڽ�Ž��
				for (int j = 0; j < arr.size(); j++) {

					if (!vertexCheck[arr.get(j)]) {
						vertexStack.push(arr.get(j));
						flag = false;
						break;
					}
				}
				if(flag) {
					vertexStack.pop();
				}
			}else {
				vertexStack.pop();
			}
		}
		
		System.out.println();
		//bfs
		//bfs�� ���� queue����
		Arrays.fill(vertexCheck, false);
		LinkedList<Integer> queue = new LinkedList<Integer>();
		current = start;
		queue.push(current);
		vertexCheck[current] = true;
		//queue�� ù����� start�� �ְ� �ݺ�������
		while(!queue.isEmpty()) {
			current = queue.peekFirst();
			ArrayList<Integer> arr = vertexEdge.get(current);
			// �Ѥ� ���������� ����� ��尡 ������쵵 �߰�;
			if(arr != null) {
				for(int i = 0; i < arr.size(); i++) {
					if(!vertexCheck[arr.get(i)]) {
						queue.add(arr.get(i));
						vertexCheck[arr.get(i)] = true;
					}
				}
				System.out.print(queue.removeFirst() + " ");
			}else {
				System.out.print(queue.removeFirst() + " ");
			}
			
		}
		
	}

}
