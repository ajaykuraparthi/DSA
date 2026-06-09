class maxWordFind {
    public static void main(String args[]) {
    
        String []sentences= {"alice and bob love leetcode","i think so too","this is great thanks very much"}
        int ans=0;

        for(int i=0; i<sentences.length; i++){
            String k= sentences[i];

            for(int j=0; j<k.length();j++){
                char ch=k.charAt(j);
                if(ch ==' '){
                    ans+=1;
                }
                ans =Math.max(ans, );
            }
        }
            int an=ans+1;
            System.out.println(an);

    }
}