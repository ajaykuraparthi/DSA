     // sum of n numbers will perform in 2 ways 
// 1  parameter     


// public  void fun(int i,int sum){
//     if(i<1){
//         System.err.println(sum);
//         return;
//     }

//     fun(i-1,sum+i);
        
// }
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// int n =sc.nextInt(); 

// sumofNums obj = new sumofNums();
// obj.fun(n,0);






//2   functional

// package recursion;

// import java.util.Scanner;

// public class sumofNums {
//         public  int fun(int n){
//             if(n==0){
//                 return 0;
              
//             }

//           return n + fun(n-1);
                
//         }
//     public static void main(String[] args) {
       
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt(); 

//         sumofNums obj = new sumofNums();
//         obj.fun(n);


//    }
// }



// factorial using recursion 

package recursion;

import java.util.Scanner;

public class sumofNums {
        public  int fun(int n){
            if(n==1){
                return 1;
              
            }

          return n * fun(n-1);
                
        }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(); 

        sumofNums obj = new sumofNums();
        System.err.println(obj.fun(n)); 


    //  time complexity is  O(n)
    // sc O(n)

    }
}
