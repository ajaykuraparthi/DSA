// class Solution {
   
//     private static int left(int arr[],int tar){
//         int l = 0;
//         int r = arr.length-1;
        
//             while(l <= r){
//                 int mid = l+(r-l)/2;
//                 if(arr[mid] >= tar){
//                     r = mid -1;
//                 }
//                 else{
//                     l = mid + 1;
//                 }
//             }

//             // if(l >= arr.length){
//             //     return 0;
//             // }
           
//             return l;
//     }

    
//     public int maximumCount(int[] nums) {

//        int neg = left(nums,0);
//        int pos = left(nums,1);
//        int  maxPos = nums.length - pos;

        
//         return Math.max(neg,maxPos); 
//     }
// }
















// // package binarySearch;
// // public class maxCount {

// //     private static int left(int arr[],int tar){
// //         int l = 0;
// //         int r = arr.length-1;
        
// //             while(l <= r){
// //                 int mid = l+(r-l)/2;
// //                 if(arr[mid] >= tar){
// //                     r = mid -1;
// //                 }
// //                 else{
// //                     l = mid + 1;
// //                 }
// //             }
// //             if(l >= arr.length){
// //                 return -1;
// //             }
// //             if(arr[l] != tar ){
// //                 return -1;
// //             }
// //             return l;
// //     }

// //      private static int right(int arr[],int tar){
// //         int l = 0;
// //         int r = arr.length-1;
// //             while(l <= r){
// //                 int mid = l+(r-l)/2;
// //                 if(arr[mid] > tar){
// //                     r = mid -1;
// //                 }
// //                 else{
// //                     l = mid + 1;
// //                 }
// //             }
// //             if(r < 0){
// //                 return -1;
// //             }
// //             if(arr[r] != tar ){
// //                 return -1;
// //             }
// //             return r;
// //     }
// //     public static void main(String[] args) {
// //         int nums[] ={-1,-2,-3,0,0,1}; 
// //         int neg = 0;
// //         int pos = 0;

// //         if( left(nums,0) == -1){
// //             neg = left(nums,1);
// //         }
// //         else{
// //                 neg = left(nums,0);
// //         }

// //         if(right(nums,0) == -1){
// //             pos = left(nums,1);
// //         }
// //         else{
// //             pos = right(nums,0);
// //         }

// //         int maxPos = (nums.length-1)-pos;
// //         System.out.println(Math.max(neg,maxPos)); 
// //     }
// //     }


// // // class Solution {
// // //     private static int left(int arr[],int tar){
// // //         int l = 0;
// // //         int r = nums.length-1;
        
// // //             while(l <= r){
// // //                 int mid = l+(r-l)/2;
// // //                 if(arr[mid] >= tar){
// // //                     r = mid -1;
// // //                 }
// // //                 else{
// // //                     l = mid + 1;
// // //                 }
// // //             }
// // //             if(r >= arr.length){
// // //                 return -1;
// // //             }
// // //             if(arr[l-1] != target ){
// // //                 return -1;
// // //             }
// // //             return l;
// // //     }

// // //      private static int right(int arr[]){
// // //         int l = 0;
// // //         int r = nums.length-1;
// // //         target = 1;
// // //             while(l <= r){
// // //                 int mid = l+(r-l)/2;
// // //                 if(arr[mid] > target){
// // //                     r = mid -1;
// // //                 }
// // //                 else{
// // //                     l = mid + 1;
// // //                 }
// // //             }
// // //             if(r < 0){
// // //                 return -1;
// // //             }
// // //             if(arr[r] != target ){
// // //                 return -1;
// // //             }
// // //             return r;
// // //     }

// // //     public int maximumCount(int[] nums) {
// // //         int neg = 0;
// // //         int pos = 0;

// // //         if( left(nums,0) == -1){
// // //             neg = left(nums,1);
// // //         }
// // //         else{
// // //                 neg = left(nums,0);
// // //         }

// // //         if(right(nums,0) == -1){
// // //             pos = left(nums,1);
// // //         }
// // //         else{
// // //             pos = right(nums,0);
// // //         }

// // //         int maxPos = (nums.length-1)-pos;
// // //         return Math.max(neg,maxPos);
// // //     }
// // // }