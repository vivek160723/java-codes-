package DSA_TASK;

public class JAN31 {

	public static void main(String[] args) {
		int arr[]= {1,3,4,56,7,7};
		int trgt=56;
		int res=sol(0,arr,trgt);
		System.out.println(res);
	}
public static int sol(int idx,int[]arr, int trgt) {
	if (idx>=arr.length)
		return -1;
	int res=sol (idx+1,arr,trgt);
	
	if (res== -1)
	{
		if(arr[idx]==trgt)
			return idx;
	}
	return res;
}

}