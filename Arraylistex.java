import java.util.ArrayList;

public class Arraylistex {

    public static void main(String[] args) {
        ArrayList<ArrayList <Integer>> arr =new  ArrayList<>();

        ArrayList <Integer> temp =new ArrayList<>();
        temp.add(2);
        temp.add(3);
        temp.add(4);

ArrayList <Integer> tempTwo =new ArrayList<>();
        tempTwo.add(2);
        tempTwo.add(3);
        tempTwo.add(6);
        // tempTwo.
        // System.out.println(tempTwo);
        arr.add(temp);
        arr.add(tempTwo);
        System.out.println(arr);

    }
}