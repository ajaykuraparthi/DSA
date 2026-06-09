import java.util.HashMap;
public class noOfGoodPairs {
    public static void main(String[] args) {
    
    
    
    
    
    
        // class Solution {
        //     public int numIdenticalPairs(int[] nums) {
        //          HashMap <Integer,Integer> hm=new HashMap<>();
        //          int ans=0;
        //          int n=nums.length;
        
        //             for(int i=0;i<n;i++){
        //                if(hm.containsKey(nums[i])){
        //                 ans += hm.get(nums[i]);
        //                 hm.put(nums[i],hm.get(nums[i])+1);
        //                }
        //                else{
        //                 hm.put(nums[i],1);
        
        //                }
        
                       
        //             }
                    
        
               
        //             return ans;


        
               
               
                // for(int i=0;i<n;i++){
                //     if(hm.containsKey(nums[i])){
                //         ans += hm.get(nums[i]);
                //         hm.put(nums[i],hm.get(nums[i])+1);
                //     }
                //     else{
                //         hm.put(nums[i],1);
                //     }
                // }
        
             
             
             
             
                // for(int i=0;i<n;i++){
                //     for(int j=i+1;j<n;j++){
                //         if(nums[i]==nums[j]){
                //             ans++;
                //         }
                //     }
                // }
                
            }
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
        //     HashMap <Integer,Integer> hm=new HashMap<>();
    //     int arr[]={1,2,1,2,1,};
    //     //(0,2),(0,4),(1,3),(2,4)  4 good pairs formed with index

     
    //     int ans=0;
    //     int n=nums.length;

    //    for(int i=0;i<n;i++){
    //        if(hm.containsKey(nums[i])){
    //            ans += hm.get(nums[i]);
    //            hm.put(nums[i],hm.get(nums[i])+1);
    //        }
    //        else{
    //            hm.put(nums[i],1);
    //        }
    //    }

    
    // return ans;
    //   }
     
      
      
      
      
      
      
      
      
      
        //brute force optimal

    //   int ans=0;
    //     int temp=0;
    //   for(int i=0;i<n;i++){
    //     temp=arr[i];

    //     if(temp==arr[i]){
    //         ans++;
    //     }
    //   }
      
    //   System.out.println(ans);
      
      
      
      
      
      
      
      
      
        //brute force    time complexity=O(n square)

//         int ans=0;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     ans++;
//                 }
//             }
//         }
// System.out.println(ans);

    }
}
