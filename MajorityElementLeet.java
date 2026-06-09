import java.util.*;
public class MajorityElementLeet {
    public static void main(String[] args) {
        // problem no 169

        int arr[]={2,2,1,1,2,2,3};
        int n=arr.length;
         
        Arrays.sort(arr);
               
        int b=n/2;
        int ans=0;
        System.out.println(arr[b]);








// HashMap <Integer,Integer> hm=new HashMap<>();

// for(int i=0;i<n;i++){
        //     int key=arr[i];

        //    hm.put(key, hm.getOrDefault(key ,0)+1) ;
        // }

        // int ans=0;
        // int a=n/2;
        // for (int i : hm.keySet()) {
          
        //     if(hm.get(i)>a){
        //         ans=i;
        //         break;
        //     }
           
          
          
        
        // } 
       //  System.out.println(ans);
    
    }
}
