public class arrayEx {
    public static void main(String[] args) {
        int arr[]={1,2,4,1,2,4,1};
        int n=arr.length;
         for(int i=0;i<n;i++){
            int a=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    a++;
                }
            }
            System.out.println(arr[i]+"-> "+a); 
         }
         
    }
}
