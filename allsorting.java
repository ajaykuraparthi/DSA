public class allsorting {

    public static void mergesort(int arr[],int low,int high){
        if(low >=high) return;
        
        int mid = (low + high)/2;

    mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);    
    }
     

    public static void merge(int arr[],int low, int mid,int high){
        int temp[]= new int[high - low + 1];
        int leftIndex = low;
        int rightIndex = mid+1;
        int tempIndex=0;

        while (leftIndex <= mid && rightIndex <= high) {
            if(arr[leftIndex] <= arr[rightIndex]){
                temp[tempIndex++] = arr[leftIndex++];
            }
            else{
                temp[tempIndex++] = arr[rightIndex++];
            }
        }

        while(leftIndex <= mid){
            temp[tempIndex++] = arr[leftIndex++];
        }

        while (rightIndex <= high) {
            temp[tempIndex++] = arr[rightIndex++];
        }
        for(int i = 0; i < temp.length; i++){
            arr[low+i]=temp[i];
        }
    }
    


    public static void main(String[] args) {
        int arr[]={30,5,3,50,0,1,4};


        
         //merge sort
         mergesort(arr, 0, arr.length - 1); 

         int n = arr.length;
          
            for(int i = 0; i < n; i++){
                 System.out.print(arr[i]+" ");
        
        }






            // insertion sort

            // int n=arr.length;

            // for(int i = 0; i < n; i++){
            //     int j=i;

            //     while (j>0 && arr[j-1]>arr[j]) {
            //         int temp = arr[j-1];
            //         arr[j-1]=arr[j];
            //         arr[j]=temp;
            //         j--;
            //     }
            // }

            // for(int i = 0; i < n; i++){
            
            //     System.out.print(arr[i]+" ");
                
            // }










        
     //bubble sort

//      int n= arr.length;
// System.err.println(arr.length);
//         for(int i = 0; i < n-1; i++){
//             for(int j = 0; j < n - i - 1; j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             System.out.print(i +" "+j);

//             }
//         }
//         System.out.println(); 

//         for(int i = 0; i < n; i++){
//             System.err.print(arr[i]+" ");

//         }


        
        
        
        
        
        
        
        
        
        // selection sort
        
        // for(int i=0;i<arr.length; i++){
        //     for(int j = i+1; j < arr.length; j++){
        //         if(arr[j] < arr[i]){
        //             int temp=arr[j];
        //             arr[j]=arr[i];
        //             arr[i]=temp;
        //         }
        //     }
        // }
        // for(int i = 0; i < arr.length; i++){
        //     System.err.print(arr[i]+" ");

        // }
    }
}
