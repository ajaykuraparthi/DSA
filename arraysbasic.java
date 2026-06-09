public class arraysbasic {
  public static void main(String[] args) {
    
    
    // int[] numbers = {1, 2, 3, 4, 5};
    // String words[]={"Apple","Banana","Orange","Mango","Pineapple"};
    // System.out.println(numbers[0]);
    // System.out.println(numbers[1]);
    // System.out.println(numbers[2]);
    // System.out.println(numbers[3]);
    // System.out.println(numbers[4]); 
    // System.out.println(words[1]);
       
//for loop

    //    for(int i=1;i<words.length;i++){
    //     System.out.println(words[i]);
    //    }
    // for(int i=0;i<5;i++){
    //     System.out.println(i);
    //     System.out.println("Ajay");
    //     System.out.println("machha");
    // }

    // for(int i=0;i<5;i++){
    //     System.out.println(words[i]);
    // }
    // int numbers[] = {1,4,8,7,0};
    // for(int i=0;i<numbers.length;i++){
    //     System.out.println(numbers[i]);
    // }





    //arrays example 1
//imagine u have thouds of number in that array u have to find how many times 1 is present
  
// int arr[]={1,2,3,4,1,1,53,35,6,3,};
// int count=0;

// for(int i=0;i<arr.length;i++){
//     if (arr[i]==1){
//         count+=1;
//     }
//    }
//     System.out.println(count);
    


//Example 
//find how many time 3 wiil be divisiblein the array   


    //    int arr[]={1,1,1,1,134,3,34,1,5,3,6,18,1};
    //    int count=0;
      
    //   for(int i=0;i<arr.length;i++){
    //    if (arr[i]%3==0){
    //        count+=1;
    //    }
    //   }
    //    System.out.println(count);



//find the the how many no with divisible by 3 and 2
// using or symbol(||)

// int arr[]={10,20,23,42,324,78,355,94};
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//             int temp=arr[i];
//             if (temp % 2 == 0 || temp % 3 == 0){         //if we wnat to divisible by both numbers we can use the and symble (&&)
//                 count+=1;                                //  if(temp % 2 == 0 && temp % 3 == 0)
//             }
//         }
//         System.out.println(count);


int arr[]={10,20,23,42,324,78,355,94};
        int count=0;
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            if ((temp % 2 == 0 || temp % 3 == 0) || (temp % 1 == 0 || temp % 5 == 0)){         //if we wnat to divisible by both numbers we can use the and symble (&&)
                count+=1;                                //  if(temp % 2 == 0 && temp % 3 == 0)
            }
        }
        System.out.println(count);







//Example 
//find the largest number in the array

//Example 
//find the sum of all the elements in the array



}}
    
    
  