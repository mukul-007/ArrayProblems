package dailyCodeBytes;

import java.util.Scanner;

public class SoldierCC {
	public static void printCost(int[] p,int[] b,int i,int n,int cost) {
		
		if(n==0) {
			System.out.println(cost);
		}
		
		if(i==n) {
			printCost(p,b,0,n-1,cost);
		}
		
		if(i<n) {
			cost=cost+((Math.abs(p[i]-p[n]))*Math.max(b[i], b[n]));	
		    printCost(p,b,i+1,n,cost);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Soldiers: ");
		int n=sc.nextInt();
		int[] p=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++) {
			p[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		int cost=0;
		printCost(p,b,0,n-1,cost);
		//cost=cost+(Math.abs(p[i]-p[j]))*Math.max(b[i],b[j]);

	}

}
