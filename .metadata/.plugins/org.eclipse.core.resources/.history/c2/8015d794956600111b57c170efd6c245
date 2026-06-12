class Solution {

    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        HashMap<Character,Character> hm = new HashMap<>();

        hm.put('(',')');

        hm.put('[',']');

        hm.put('{','}');

 

        for(int i = 0; i < s.length();i++){

            if(s.charAt(i) == '(' || s.charAt(i)=='[' || s.charAt(i) == '{'){

                st.push(s.charAt(i));

            }

            else{

                if(st.isEmpty()){

                    return false;

                }

                if(hm.get(st.peek()) != s.charAt(i)){

                    return false;

                }

                st.pop();

            }

        }

        if(!st.isEmpty()){

            return false;

        }

        return true;

     }

} here is my final code can we optimize space 