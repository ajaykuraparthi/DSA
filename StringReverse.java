

class StringReverse {
    public static void main(String[] args) {
        
    // String s= "abcd";
    // for(int i = s.length()-1; i >=0; i--){
    //     System.out.println(s.charAt(i));
    // }



















//     String s="abcd";
//     String ans="";
//    for(int i = s.length()-1; i >=0; i--){
     
//       ans += s.charAt(i);
//    }
//    System.out.println(ans);


// check if the string is palindrome or not
     
        
// String s="aba";
// String ans="";
       
//        for(int i = s.length()-1; i >=0; i--)
//        {
           
//             ans += s.charAt(i);
//        }
       
// if (ans.equals(s)){

//    System.out.println("palindrome");
// }

// else{
//    System.out.println(ans +""+"not palindrome");
// }

//find prime no easy way:


// int num=7;
// int count=0;


// for(int i=1;i<=num;i++){
//     if(num % i == 0){
//         count+=1;
   
//     }
// }
   
//  if (count==2) {
//  System.out.println("prime number");   
//  }
//   else {
//     System.out.println("not prime number");
    
//  }   









Scanner scan = new Scanner(System.in);
      System.out.println("Enter the value:");
      String s= scan.nextLine();
       
     //  String s= "aja";
       
       String count="";
       
       int i=s.length()-1;
       
           while( i>=0){
               count+=s.charAt(i);
               i--;
           }
           if(count.equals(s)){
               System.out.println(s + " is a palindrome");
           }
           else{
               System.out.println(s + " is not a palindrome");
           }
       


}

    }
