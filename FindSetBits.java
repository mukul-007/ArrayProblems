package dailyCodeBytes;

import java.util.Scanner;

public class FindSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		System.out.println(findCount(n,0));
	}
	public static int findCount(int n,int count) {
		
		while(n!=0) {
			if(n%2==1) {
				count++;
			}
			n=n/2;
		}
		
		
		return count;
	}

}
