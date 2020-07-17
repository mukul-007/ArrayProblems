package dailyCodeBytes;

import java.util.Scanner;

public class BurningCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int c = 1;
		int count = 0;
		
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i] != c) {
				a[i] = 0;
				count++;
			}else {
				c++;
			}
		}
		
		if(count>a.length-1) {
			System.out.println("-1");
		}else {
			System.out.println(count);
		}
	}

}
