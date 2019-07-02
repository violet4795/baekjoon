package codeforces;

import java.util.Scanner;

public class Thanos_Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.nextLine());
		int arr[] = new int[length];
		for(int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = length; i >= 1; i /= 2) {
			if(i == 1) {
				System.out.println(i);
				break;
			}
			if(isThanos(arr, i)) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
		
	}
	public static boolean isThanos(int[] arr, int a) {
		int start = 0;
		int end = start + a;
		int prev = 0;
		for(int k = 0; k < arr.length / a; k++) {
			for(int i = start; (i < end && i < arr.length); i++) {
				if(i == start) {
					prev = arr[i];
				}else {
					if(prev <= arr[i]) {
						if(end - 1 == i) {
							return true;
						}else {
							prev = arr[i];
						}
					}else {
						start = end;
						end = start + a;
						break;
					}
				}
			}
		}		
		return false;
	}
}
