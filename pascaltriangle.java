import java.util.*;
class pascaltriangle {
    
    
    
    
    
    
    public static List<List<Integer>>  fun(int r){
    
     List<List<Integer>> ans= new ArrayList<>();
     
     List<Integer> firRow = new ArrayList<>();
             
      ans.add(firRow);  

      
      
      for(int i=1;i<r;i++){
          List<Integer> temp = new ArrayList<>();
          temp.add(1);
          for(int j=1;j<i;j++){
              int val=ans.get(i-1).get(j) + ans.get(i-1).get(j-1);  
            
             temp.add(val); 
          }
          
          temp.add( 1);
          ans.add(temp);
          
      }
      
        System.out.println(r);
      
          
      
      
      
      
      
      
      
      
      
      
      
        return ans;
        
    }
    
     public static void main(String[] args) {
       System.out.println(fun(5));
       
    }
}