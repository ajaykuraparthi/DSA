package binarySearch;

public class type3binarySearch {

    
    // finding left most number:


    private static int leftMost(int arr[], int tar){
        int l = 0;
        int r = arr.length-1;

            while (l <= r) {
               int mid = l+(r - l)/2;
               
          
              if(arr[mid] >= tar){
                 r = mid - 1;
               }
               else{
                l = mid + 1;
               }
            }
            // System.out.println(r +" " + l);
            // return -1;
                if (l >= arr.length) {
                    return -1;
                }
                if(arr[l] != tar){
                    return -1;
                }

            return l;

        }

            // finding right most number:
              
            private static int rightMost(int arr[],int tar){
                int l = 0;
                int r = arr.length-1;
                 
                    while(l <= r){
                        int mid = l+(r - l)/2;
                        
                        if(arr[mid] > tar){
                            r = mid - 1;
                        }
                        else{
                            l = mid + 1;
                        }
                    }
                    if(r < 0){
                        return -1;
                    }
                    if(arr[r] != tar){
                        return -1;
                    }
                    return r;
            
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,3,3,3,4};
        int target = 10;
        // int ans = search(nums,target);
        // System.out.println(ans);
        System.out.println(leftMost(nums, target) + " " + rightMost(nums, target));
    }
}










// package binarySearch;

// public class type3binarySearch {

    
//     // finding left most number:


//     private static int leftMost(int arr[], int tar){
//         int l = 0;
//         int r = arr.length-1;

//             while (l <= r) {
//                int mid = l+(r - l)/2;
               
//                if(arr[mid] == tar){
//                 //   return mid;
//                 r = mid - 1;
//                }
//                else if(arr[mid] > tar){
//                  r = mid - 1;
//                }
//                else{
//                 l = mid + 1;
//                }
//             }
//             // System.out.println(r +" " + l);
//             // return -1;
//             return l;

//         }

//             // finding right most number:
              
//             private static int rightMost(int arr[],int tar){
//                 int l = 0;
//                 int r = arr.length-1;
                 
//                     while(l <= r){
//                         int mid = l+(r - l)/2;
//                         if(arr[mid] == tar){
//                             l = mid + 1;
//                         }
//                         else if(arr[mid] > tar){
//                             r = mid - 1;
//                         }
//                         else{
//                             l = mid + 1;
//                         }
//                     }
//                     return r;
            
//     }
//     public static void main(String[] args) {
//         int nums[] = {1,2,3,3,3,3,4};
//         int target = 3;
//         // int ans = search(nums,target);
//         // System.out.println(ans);
//         System.out.println(leftMost(nums, target) + " " + rightMost(nums, target));
//     }
// }
