public class twoDArrays {
    public static void main(String[] args) {
        int mat[][]={{1,3,4},
                     {2,1,3},
                     {3,2,1}};
    
            int rowLen = mat.length;
            int colLen = mat[0].length;

            int temp = 0; 

            for(int i = 0; i < rowLen; i++){
                for(int j = 0; j < colLen; j++){
                   
                    if(temp == i - j){
                   System.out.print(mat[i][j]+" ");
                    }
                }
                System.out.println(" ");
            }















        //     int r=mat.length;
        //     int c=mat[0].length;

        //     int i=0;  
        //     int j=0;
        // boolean isValid=true;
        // int temp=mat[i][j];
        //     while (i<r && j<c)  {
        //         if(mat[i][j]!=temp){
        //         //  System.out.println(i+""+j);
        //         isValid=false;
        //     }
        //         i++;
        //         j++;
        //     }
            
        //     System.out.println(isValid);
            // for(int i=0;i<r;i++){
            //     int temp=c-i-1;
            //     System.out.println(mat[i][temp]);
            //     // System.out.println(i+" "+ (c-i-1));
            // }
            
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
      // int r =mat.length;
        // System.out.println(r);
        // int c =mat[0].length;
        // System.out.println(c);
        
       

// int i=

    //    for(int i=0;i<r;i++){
    //     System.out.println(mat[i][i]);
    //    }
       
       
       
       
        // for(int i=0;i<r;i++){
        //    for(int j=0;j<c;j++){
        //     System.out.println(mat[i][j]);
        //    }
        // }
                                                                        
    }
}
