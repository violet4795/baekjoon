package Q1000_1099;

import java.util.Scanner;

//�����

public class Q1004 {
	static int[] start;
	static int[] end;
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = Integer.parseInt(sc.nextLine());
		
		for(int x = 0; x < testCase; x++) {
			count = 0;
			start = new int[] {sc.nextInt(), sc.nextInt()};
			end = new int[] {sc.nextInt(), sc.nextInt()};
			sc.nextLine();
			int planetCoster = Integer.parseInt(sc.nextLine());
			for(int i = 0; i < planetCoster; i++) {
				planetCalc(sc.nextInt(), sc.nextInt(), sc.nextInt());
				sc.nextLine();
			}
			System.out.println(count);
		}
		sc.close();
		//�����±�� �Ÿ��� �����̾��⶧���� �����ذ����ִٰ� �����Ҽ��ִ�.
		//������� �������� ��� ���ȿ� �����ִ����� ���ϸ� �Ǵ¹���.
	}
	public static void planetCalc(int x1, int y1, int r1){
		double startDistance = Math.sqrt(Math.pow(start[0]-x1, 2) + Math.pow(start[1]-y1, 2));
		double endDistance = Math.sqrt(Math.pow(end[0]-x1, 2) + Math.pow(end[1]-y1, 2));
		if(startDistance < r1 && endDistance < r1) {
			
		}else if(startDistance < r1 || endDistance < r1) {
			count++;
		}
	}
}
