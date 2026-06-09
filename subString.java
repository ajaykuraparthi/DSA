public class subString {
    public static void main(String[] args) {
        String s = "abcde";
        String words[] = {"a","bb","acd","ace"};
        int cnt = 0;
        int i = 0;
        for(String word : words){
           if(isSequence(word, words[i])){
              cnt++;
           }
        }
        System.out.println(cnt);
    }

    private static boolean isSequence(String word , String s){
            int i = 0, j = 0;

            while (i < word.length() && j < s.length()) {
                if(word.charAt(i) == s.charAt(j)){
                   i++;   
                }
                j++;
                 
            }
            return s.length() == i;

    }
}
