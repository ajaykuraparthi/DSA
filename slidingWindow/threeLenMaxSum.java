package slidingWindow;
class threeLenMaxSum {
    public static void main(String[] args) {
      int arr[]={3,4,3,2,1,3,4,30,5,8};
    
            int sum = 0;
            
            for(int i = 0; i < arr.length-2; i++){
                int tempSum = arr[i]+arr[i+1]+arr[i+2];
                sum = Math.max(tempSum,sum);
            }
            System.out.println(sum);
            
            
            // for(int i = 0; i < arr.length;i++){
            //         for(int j = i+1; j < arr.length; j++){
            //             for(int k = j+1; k < arr.length; k++){
            //                 int temp = arr[i]+arr[j]+arr[k];
            //                 sum = Math.max(sum,temp);
            //             }
            //         }}
            //         System.out.println(sum);
    }
                    
}

