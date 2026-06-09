import java.util.HashSet;
public class hashset {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(10);
        hs.add(20);
        hs.remove(10);
        if(hs.contains(10)){
            System.out.println("unddhi machha");
        }
        else{
            System.out.println("ledhu machha");
        }
        System.out.println(hs.size());
        System.out.println(hs);
    }
}