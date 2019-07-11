package Q2000_2999.Q2600_2699;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int num = Integer.parseInt(String.valueOf(s));
		String x = "";
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < num; i++) {
			x = br.readLine();
			String array[] = x.split(" "); 
			for(int j = 0; j < array[1].length(); j++) {
				
				for(int k = 0; k < Integer.parseInt(array[0]); k++) {
					sb.append(array[1].charAt(j));
				}
			}
			sb.append("\n");
			bw.write(sb.toString());
			bw.flush();
			sb.setLength(0);
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
}
