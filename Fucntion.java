package DSA_TASK;
//199 January 2024
// jab jab function ki call lgti hn tabh tabh ek stackframe bnta hn
public class Fucntion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=10;
int res=add(a,b);
System.out.println(res);
	}

public static int add(int a,int b) {
	int sum=a+b;
	int sub=sub(sum,b);
	System.out.println(sub);
	return sub;
}
public static int sub(int a,int b) {
	int res=a-b;
	System.out.println("      Hello");
	return res;
}
	}


