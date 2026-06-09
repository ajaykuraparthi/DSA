package search;

// Q) Given an array of character sorted in ascending
// order, find the greatest character that is less than
// the target character in the array.
// Target character is not present in the array.

// If there is not such element return ‘a’
// {'c', 'e', 'g', 'k', 'y'}

// Target = ‘d’ => ans = ‘c’

// Target = ‘f’ => ans = ‘e’

// Target = ‘z’ = > ans = ‘y’

// Target


public class insertEl {
     private static char searchVal(char arr[],char tar){
        int low = 0, high = arr.length-1;
        
        while (low <= high) {
            int mid = low + (high - low)/2;

               
                if(arr[mid] > tar){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            
        }
        return arr[high];

     }
    public static void main(String[] args) {
        // int nums[] = {1,3,4,5,6,8};

        char values[] = {'a','c','d','e','g'};
        
        char target = 'b';
            if(target == values[0]){
                System.out.println(target);
            }

        char ans = searchVal(values, target);
        System.out.println(ans);
    }
}








// // arr = [ 1,3,5,7,8,10]
// // Find the index Where We can insert a new element.
// // Element we are adding in the above array is not
// // there in the array.




// public class insertEl {
//      private static int searchVal(int arr[],int tar){
//         int low = 0, high = arr.length-1;
        
//         while (low <= high) {
//             int mid = low + (high - low)/2;

               
//                 if(arr[mid] > tar){
//                     high = mid - 1;
//                 }
//                 else{
//                     low = mid + 1;
//                 }
            
//         }
//         return low;

//      }
//     public static void main(String[] args) {
//         // int nums[] = {1,3,4,5,6,8};

//         int target = 2;

//         int ans = searchVal(nums, target);
//         System.out.println(ans);
//     }
// }
