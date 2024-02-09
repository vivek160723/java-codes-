package DSA_TASK;

import java.util.Scanner;

public class leetcode22 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		int n=new Scanner(System.in).nextInt();
		sol(n,0,0,"");
	}
		
			public static void sol(int n,int ob,int cb,String ans) {
				if (ob>n)
					return;
				if (ob+cb==2*n) {
					System.out.println(ans);
					return;
				}
				if (cb>ob)
					return;
			sol(n,ob+1,cb,ans+"(");
			sol(n,ob,cb+1,ans+")");
			
			
		}

	}


