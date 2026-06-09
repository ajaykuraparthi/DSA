public class secondlargest {
    public static void main(String[] args) {
        int arr[]={7,7,7,7,7};

        int firhigh=0;
        int secondhigh=0;

            for(int i = 0; i< arr.length; i++){
                if(arr[i]>firhigh){
                    firhigh=arr[i];
                }
            }
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > secondhigh && arr[i]!=firhigh ){
                    secondhigh = arr[i];
                }

               
            }

           
            System.out.println(secondhigh);
    }
}
