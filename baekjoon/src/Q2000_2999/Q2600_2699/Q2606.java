package Q2000_2999.Q2600_2699;

import java.util.Arrays;
import java.util.Scanner;

public class Q2606{
	public static void main(String args[]){
		int[] d = new int[6];
		long n = 10;
		String.valueOf(n);
		StringBuffer sb = new StringBuffer();
		String s = "132683";
		for(int i = 0; i < s.length(); i++) {
			d[i] = Integer.parseInt(s.substring(i, i+1));
			System.out.println(d[i]);
		}
		Arrays.sort(d);
		for(int i = 0; i < s.length(); i++) {
			System.out.print(d[i]);
		}
		System.out.println(d.toString());
	}
}
