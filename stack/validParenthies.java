package stack;

import java.util.HashMap;

public class validParenthies {
    public static void main(String[] args) {
        String str = "{[()]}";
        char temp1[] = {'{','[','('};
        char temp[] = {'}', ']',')'};

        HashMap <Character,Character> hm = new HashMap<>();

        for(int i = 0; i < 3;i++){
        if(!hm.containsKey(temp[i])){
            hm.put(temp[i], temp1[i]);
        }
        }
        for(char i: hm.keySet()){
            System.out.println(i + "  ---->  "+ hm.get(i));
        }

        
    }
}
