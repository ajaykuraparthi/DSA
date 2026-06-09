package binarySearch;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int i = 0;
        System.out.println("Enter elements to the array:");
        while( i < size){
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("enter the value to search:");
    int target = sc.nextInt();
    
    int ans = search(arr,target);
    System.out.println("the target find at position of:" + ans );
    }
    private static int search(int nums[],int val ){
            int l = 0;
            int r = nums.length-1;

                while (l <= r) {
                    int mid = (l + r)/2;
                    if(nums[mid] == val ){
                        return mid;
                    }
                    else if(nums[mid] > val){
                        r = mid-1;
                    }
                    else{
                        l = mid + 1;
                    }
                    
                }
                    return -1;
    }
}
