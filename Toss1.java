package DSA_TASK;
//head and tail
	import java.util.Scanner;

	public class Toss1 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int step=toss("", n);
			System.out.println(step);
			 sc.close();
		}

		private static int toss(String s, int n) {
			// TODO Auto-generated method stub
			if(n==0) {
				System.out.println(s);
				return 1;
			}
			int Head=toss(s+"H"+" ",n-1);
			int tail=toss(s+"T"+" ",n-1);
			return+Head+tail;
		}

		    }