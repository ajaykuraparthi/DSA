
public class search {
    private static int binarySer(int arr[] , int val){
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid =  (r + l) / 2;
            if (arr[mid] == val) {
                return mid;
            } else if (arr[mid] > val) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] ={1,2,4,5,7,9};
        int target = 7;

       int ans = binarySer(nums, target);
       System.out.println(ans);
        
    }
}
