class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int  i = 0; i < nums.length;i++){
           if(i > 0 && nums[i] == nums[i-1])continue;
           int l = i + 1;  int r = nums.length - 1;
            while(l < r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum == 0){
                    
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l < r && nums[r] == nums[r+1])r--;
                    while(l < r && nums[l] == nums[l-1])l++;
                }
                else if(sum > 0){
                    r--;
                    
                }
                else{
                    l++;
                    
                }
            }
        }
          return ans;
    }

}

//     private static List<List<Integer>> find (int arr[],int n){
//         Set<List<Integer>> st = new HashSet<>();

//         for(int i = 0; i < arr.length; i++){
//             Set<Integer> tempSet = new HashSet<>();
            
//                 for(int j = i + 1; j < arr.length; j++){
//                     int thirdElm = -(arr[i] + arr[j]);
//                     if(tempSet.contains(thirdElm)){
//                         List<Integer> lst = Arrays.asList(arr[i],arr[j],thirdElm);
//                         Collections.sort(lst);
//                         st.add(lst);
//                     }
//                     tempSet.add(arr[j]);
//                 }
//         }
//             return new ArrayList(st);

//     }
// }



    //private static List<List<Integer>> find(int arr[],int n){
    // Brute  SC ---> O(N^3)
    
    //     Set<List<Integer>> st = new HashSet <>();
    //     for(int i = 0; i < n; i++){
    //         int k = i + 1;
    //         for(int j = i + 2; j < n; j++){
               
    //                 if(arr[i] + arr[j] + arr[k] == 0){
    //                     List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
    //                     Collections.sort(temp);
    //                     st.add(temp);
    //                 }
    //             k++;
    //         }
    //     }
    //     return new ArrayList<>(st);
    // }
    // public List<List<Integer>> threeSum(int[] nums) {
    //     int n = nums.length;

    //         List<List<Integer>> lst = find(nums,nums.length);
    //         return lst;
//     }
// }