package DSA_TASK;

import java.util.Scanner;

//11 January 2024
public class Patt {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of rows:");
		;
		System.out.println("Enter the number of cst:");
		@SuppressWarnings("resource")
		int nst=new Scanner(System.in).nextInt();
//		System.out.println("Enter the number of nsp:");
		@SuppressWarnings("resource")
		int nsp=new Scanner(System.in).nextInt();
		for (int csp=0;csp<nsp;csp++) {
			System.out.println(" ");
		}
			for (int cst=0;cst<nst;cst++){
				System.out.print("🔴"+"   ");
			}
			nsp--;
			nsp++;
			System.out.println();
		}
	}

