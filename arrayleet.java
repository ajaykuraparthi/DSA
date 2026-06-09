import java.util.*;
class arrayleeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c=sc.nextInt();
        int arr[]=new int[c];
        //int arr[]={17,18,5,4,6,1};
        int n=arr.length;

        int maxnum=-1; 
            
        for(int i=n-1;i>=0;i--){
            int s=sc.nextInt();
            arr[i]=s;
            int prev=arr[i];
            arr[i]=maxnum;
            maxnum=Math.max(maxnum,prev);
          
        }

    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" "); 
    }
    }
   
}
