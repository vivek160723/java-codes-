package DSA_TASK;

public class Bjan31 {

    public static void main(String[] args) {
        int arr[]= {1,2,1,1,3,4};
        int trgt=1;
        int res[]=sol(0,trgt,arr,0);
        for(int i=0; i<res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] sol (int idx,int trgt,int[]arr,int cnt) {
        if(idx==arr.length) {
            int res[]=new int[cnt];
            return res;
        }
        if (arr[idx]==trgt) {
            int res[]=sol(idx+1,trgt,arr,cnt+1);

            res[cnt]=idx;
            return res;
        } else {
            int res[]=sol(idx+1,trgt,arr,cnt);
            return res;
        }
    }
}