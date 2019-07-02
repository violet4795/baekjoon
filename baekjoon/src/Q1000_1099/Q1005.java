package Q1000_1099;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q1005 {
	public static HashMap<Integer, node> nodes = new HashMap<Integer, node>();
	public static Stack<Integer> stack = new Stack<Integer>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
		int testCase = Integer.parseInt(st.nextToken());
		
		for (int x = 0; x < testCase; x++) {
			nodes = new HashMap<Integer, node>();	
			st = new StringTokenizer(br.readLine());
			int nodeSize = Integer.parseInt(st.nextToken());
			int ruleSize = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			for(int y = 1; y <= nodeSize; y++) {
				nodes.put(y, new node());
				nodes.get(y).buildingTime = Integer.parseInt(st.nextToken());
			}

			for(int y = 0; y < ruleSize; y++) {
				st = new StringTokenizer(br.readLine());
				int first = Integer.parseInt(st.nextToken());
				int second = Integer.parseInt(st.nextToken());
				nodes.get(first).out.add(second);
				nodes.get(second).in.add(first);
			}
			
			int start = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
			stack.push(start);
			int current;
			node node;
			int currNodeRequireTime;
			int currNodeBuildTime;
			int currentRequireTime;

			while (!stack.isEmpty()) {
				current = stack.peek();
				node = nodes.get(current);
				if (node.in.size() != 0) {
					current = node.in.get(0);
					stack.push(current);
				} else {
					stack.pop();
					node = nodes.get(current);
					for (int i = 0; i < node.out.size(); i++) {
						currNodeRequireTime = nodes.get(current).prerequisiteTime;
						currNodeBuildTime = nodes.get(current).buildingTime;
						currentRequireTime = nodes.get(node.out.get(i)).prerequisiteTime;
						if (currentRequireTime < (currNodeRequireTime + currNodeBuildTime)) {
							nodes.get(node.out.get(i)).prerequisiteTime = (currNodeRequireTime + currNodeBuildTime);
						}
						node tempNode = nodes.get(node.out.get(i));
						for (int j = 0; j < tempNode.in.size(); j++) {
							if (tempNode.in.get(j) == current) {
								tempNode.in.remove(j);
								break;
							}
						}
					}
				}
			}
			System.out.println(nodes.get(start).prerequisiteTime + nodes.get(start).buildingTime);
		}
	}

	public static class node {

		public int buildingTime;
		public ArrayList<Integer> in;
		public ArrayList<Integer> out;
		public ArrayList<Integer> needBuildingNode;
		public int prerequisiteTime; // 이 건물을 짓기위한 사전필요시간(자기자신 제외)

		node() {
			in = new ArrayList<Integer>();
			out = new ArrayList<Integer>();
			needBuildingNode = new ArrayList<Integer>();
			prerequisiteTime = 0;
		}
	}

}
