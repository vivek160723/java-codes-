package DSA_TASK;

import java.util.Scanner;

public class headtail {

	public static void main(String[] args) {
		
			@SuppressWarnings("resource")
			int n=new Scanner(System.in).nextInt();
			sol(n,"");
		}
			
				public static void sol(int n,String ans) {
					
					if (n==0) {
						System.out.println(ans);
						return;
					}
				sol(n-1,ans+"H"+" ");
				sol(n-1,ans+"T"+" ");
				
				

	}

}
