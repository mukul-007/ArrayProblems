package dailyCodeBytes;

import java.util.Scanner;

public class SubsetSumEasy {
	
	static int count = 0;

	public static void getResult(long[] a, int vidx, long sum){
		
		if(vidx == a.length) {
			if(sum == 0) {
				count++;
				return;
	
			}
		}
		
		if(vidx < a.length) {
			getResult(a, vidx + 1, sum);
			
			getResult(a, vidx + 1, sum + a[vidx]);
		}
		
			
		return;
    } 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		     int n = sc.nextInt();
		     long[] a = new long[n];
		     
		     for(int i=0;i<n;i++){
		         a[i] = sc.nextInt();
		     }
		     
		     getResult(a, 0, 0);
		     
		     if(count > 1) {
		    	 System.out.println("Yes");
		     }else {
		    	 System.out.println("No");
		     }
		     
		     count = 0;
		     
		}
		
	}

}
