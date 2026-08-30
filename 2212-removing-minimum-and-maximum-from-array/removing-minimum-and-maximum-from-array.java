class Solution {
    public int minimumDeletions(int[] nums) {
        int min =0;
        int max = 0;
       int n = nums.length;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] < nums[min]){
                min = i;
               
            }
            if(nums[i] > nums[max]){
                max = i;
            }
        }
// Make minIdx the smaller index
        int left = Math.min(min, max);
        int right = Math.max(min, max);

    int dleft =right +1;
    int dright = n - left;
    int both =(left + 1) +( n - right);
    return Math.min(dleft,Math.min(dright,both));
      
    }
}