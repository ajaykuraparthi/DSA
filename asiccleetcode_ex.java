 
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class asiccleetcode_ex {
    public static void main(String[] args) {
     String s="hello";
      
      int some=0;
      
      for(int i=0;i<s.length()-1;i++){
          
          int a=i;
          int b=i+1;
          
          char first = s.charAt(a);
          char second = s.charAt(b);
          
          int asiccfir = first;
          int asiccsec = second;
          
          int temp = Math.abs(asiccfir-asiccsec);
          some +=temp;
          //System.out.println( temp);
      }
      System.out.println( some);
      
    }
}