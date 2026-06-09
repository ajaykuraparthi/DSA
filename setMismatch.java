import java.util.*;;
public class setMismatch {
    public static void main(String[] args) {
        HashSet <Integer> hs = new HashSet<>();
        //int temp=0;
        
       int nums[]={1,2,2,3,4};
       
        int duplicate=0;
       

       for(int i=0;i<nums.length;i++){
        if(!hs.contains(nums[i])){
            hs.add(nums[i]);
        }
        else{
            duplicate=nums[i];
        }
        
    }
    int missing=-1;
       for(int i=1;i<nums.length;i++){
            if(!hs.contains(i)){
                missing = i;
            }
       }
       System.out.println(duplicate);
       System.out.println(missing);
       
        // int nums[]={1,1};

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==temp){
        //         hs.add(nums[i]);
        //         hs.add(nums[i]+1);
        //     }
        //     temp=nums[i];
        // }
        // System.out.println(hs);
    }
}
