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
		//최초 stack에 들어간 start가 pop된다면 모든 인자를 다 순회했다고 볼수있다.
		while(!vertexStack.isEmpty()) {
			
			flag = true;
			// current는 스택맨위의 인자
			current = vertexStack.peek();

			//current는 두가지 경우로 나뉜다.
			//current가 방문하지 않은 인자일경우.
			//방문한뒤 pop으로 다시 돌아온 경우.
			//stack에서 pop당한뒤 다시돌아온거라면 걸러내야하기때문에 조건추가
			if(!vertexCheck[current]) {
				vertexCheck[current] = true;
				vertexStack.push(current);
				System.out.print(current + " ");
			}
			
			// 내 자식들 중에서 방문하지 않은 인자를 찾아 스택에 넣는다.
			//없다면 pop

			ArrayList<Integer> arr = vertexEdge.get(current);
			// ㅡㅡ 시작점에서 연결된 노드가 없을경우도 추가;
			if(arr != null) {
				// 자식탐색
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
		//bfs에 사용될 queue선언
		Arrays.fill(vertexCheck, false);
		LinkedList<Integer> queue = new LinkedList<Integer>();
		current = start;
		queue.push(current);
		vertexCheck[current] = true;
		//queue에 첫노드인 start를 넣고 반복문실행
		while(!queue.isEmpty()) {
			current = queue.peekFirst();
			ArrayList<Integer> arr = vertexEdge.get(current);
			// ㅡㅡ 시작점에서 연결된 노드가 없을경우도 추가;
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
