import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class uniquElementSum {

    public static void main(String[] args) {
    
        // unique element in array sum :
      
                    int nums[]= {1,2,3,1,5,4,3,2,6,7,8,1,0};
            
            Map<Integer,Integer> hm = new HashMap<>();
            
            for(int i : nums){
                if(!hm.containsKey(i)){
                    hm.put(i,1);
                }
                else{
                    
                    hm.put(i,hm.get(i) + 1);
                }
            }
            int sum = 0;
            for(int i : hm.keySet()){
                if(hm.get(i) == 1){
                    sum += i;
                }
            }
            System.out.println(sum);

        




    // distinct element sum :
    
        // int nums[]= {1,2,3,1,5,4,3,2,6,7,8,1,0};
        // int sum = 0;
        // Set <Integer> el = new HashSet<Integer>();

        // for(int i : nums){
        //     el.add(i);
    
        // }

        // for(int i:el){
        //     sum += i;
        // }
        // System.out.println(sum);
    }
}