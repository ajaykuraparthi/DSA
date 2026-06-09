import java.util.*;
public class subArrStr {
    public static void main(String[] args) {
       
       int arr[]={5,9,1,8,7};
       int n=arr.length;

       for(int i=0;i<n;i++){
        int temp=0;
        for(int j=i;i<n;j++){
            for(int k=i;k<=j;k++){
                System.out.print(i+" "+j);
            
        }
        System.out.println();
       }
    }
    
       
       
       
       
       
       
       
       
       
        // int arr[]={1,3,5,7};
        // String str="Ajay";

        // //subsString

        //    // System.out.println(str.substring(0,3));
 
        // ArrayList <String> arr = new ArrayList<>();
        //    int n= str.length();
        // for(int i=0;i<n;i++){ 
        //     for(int j=i;j<n;j++){
               
        //        String var=str.substring(i,j+1);
        //         arr.add(var);
        //     }

        // }
        // System.out.println(arr);




        // int n= str.length();
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         for(int k=i;k<=j;k++){
        //         System.out.print(str.charAt(k)+" ");

        //         }
        //         System.out.println();

        //     }
        // }
        
        
        
        
        
        
        
        // int n= arr.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         for(int k=i;k<=j;k++){
        //         System.out.print(arr[k]+" ");

        //         }
        //         System.out.println();

        //     }
        // }
    }  
}
