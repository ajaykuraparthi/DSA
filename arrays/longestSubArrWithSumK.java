import java.util.*;
class longestSubArrWithSumK {
    public static void main(String[] args) {
     
        int nums[] = {1,2,3,1,1,1,1,3,3};
        int k = 6;
        int maxLen = 0;
        int left = 0;
        int right = 0;
        int sum = nums[0];
        
            while(nums.length -1 > right){
                 right++;
                 sum += nums[right];
                    
                    while(left <= right && sum > k){
                        sum -= nums[left];
                        left++;
                    }

                        if(sum == k){
                        maxLen = Math.max(maxLen, right + 1 - left);
                    }
            
                
            }
  
         System.out.println(maxLen);
        
     
     
     
     
     
     
     
     
     
        // int nums[] = {1,2,3,1,1,1,4,2,3};
        // int k = 3;
        // HashMap<Integer,Integer> hm = new HashMap<>();
        // int sum = 0;
        // int len = 0;
        
        // for(int i = 0; i < nums.length; i++){
           
        //     sum += nums[i];
            
        //     if(sum == k){
        //         len = i+1;
        //     }
            
        //     hm.put(sum,i);
            
        //     if(hm.containsKey(sum - k)){
        //         len = Math.max(len , i - hm.get(sum - k));
        //     }
           
           
        // }
        //  System.out.println(len);
        
        
        
            }
}