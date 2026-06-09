package slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class substrarrEx {
    public static void main(String[] args) {
        

    //   int arr[]={1,2,3,4};
    String str = "Ajay";

        List<String> lst = new ArrayList<>();
            
            for(int i = 0; i < str.length();i++){
                for(int j = i; j < str.length(); j++){
                  
                   String temp = str.substring(i,j+1);
                    lst.add(temp);
                    System.err.print(temp);
                    // for(int k = i; k <= j; k++){
                    //     System.out.print(str.charAt(k)+" ");
                        
                        
                    // }
                    
                    System.out.println();
                }
                
                
            }
 

// 0 0
// 0 1
// 0 2
// 0 3
// 1 1
// 1 2
// 1 3
// 2 2
// 2 3
// 3 3
    }
}
