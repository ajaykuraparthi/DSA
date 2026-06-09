import java.util.Arrays;
public class sorting {
 public static void main(String[] args) {
   
    

    int arr[]={6,5,11,9,4};
    Arrays.sort(arr);
    // Num swap
    
    //    int fir=arr[0];

    
//    arr[0]=arr[1];
//    arr[1]=fir;


// Bubble sort  Asending order
// int n=arr.length;
//     for(int i=0;i<n-1;i++){
//         boolean swaped = false;
//         for(int j=0;j<n-i-1;j++){
//             if(arr[j] > arr[j+1]){
//                 int temp=arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=temp;
//                 swaped=true;
//             }
          
//         }
//         if(swaped=false){
//             break;
//         }
//     }
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//     }




    //Bubble sort  Desending order
int n=arr.length;
// for(int i=0;i<n-1;i++){
//     boolean swaped = false;
//     for(int j=0;j<n-i-1;j++){
//         if(arr[j]<arr[j+1]){
//             int temp=arr[j];
//             arr[j]=arr[j+1];
//             arr[j+1]=temp;
//             swaped=true;
//         }
      
//     }
//     if(swaped=false){
//         break;
//     }
// }
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}

 }   
}
