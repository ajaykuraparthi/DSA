import java.util.HashSet;

public class whileloop {
 public static void main(String[] args) {
    HashSet <Integer> hs =new HashSet<>();
hs.add(10);
hs.add(20);
hs.add(30);
    int i=0;

    while(i<10){
        System.out.println("boom");
        
       if(i==0){
        hs.remove(i);
       }
       else{
        hs.remove(0);
       }
    }
 }   
}
