import java.util.*;
public class Binary{
    public static int bin(int arr[],int low,int high,int trgt){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==trgt){
            return mid;a
        }
        if(arr[mid]<trgt){
            return bin(arr,mid+1,high,trgt);
        }else{
             return bin(arr,low,mid-1,trgt);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int trgt=sc.nextInt();
            int arr[]={1,2,3,4,5,6,7};
            int low=0;
            int high=(arr.length-1);
            System.out.println(bin(arr,low,high,trgt));
        }
    }

    
    

