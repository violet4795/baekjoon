package Q1000_1999.Q1000_1099;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1018 {
	public static int chessMin = 128;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		boolean[][] chess = new boolean[x][y];
		
		for(int i = 0; i < y; i++) {
			char[] temp = br.readLine().toCharArray();
			for(int j = 0; j < x; j++) {
				chess[j][i] = temp[j] == 'W' ? true : false;
			}
		}
		
		for(int i = 0; i < chess.length - 7; i++) {
			for(int j = 0; j < chess[i].length - 7; j++) {
				compareChess(i, j, chess);
			}
		}
		System.out.println(chessMin);
	}
	public static void compareChess(int xIndex, int yIndex, boolean[][] chess) {
		int minW = 0;
		int minB = 0;
		boolean flag = true;
		for(int i = xIndex; i < xIndex + 8; i++) {
			for(int j = yIndex; j < yIndex + 8; j++) {
				if(chess[i][j] == flag) {
					minW ++;
				}else {
					minB ++;
				}
				flag = !flag;
			}
			flag = !flag;
		}
		int min = (minW <= minB ? minW : minB );
		if(min < chessMin) {
			chessMin = min;
		}
	}
}
