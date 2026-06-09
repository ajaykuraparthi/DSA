// to handle the multiple catch clauses

import java.util.*;

public class exceptions {
    public static void main(String[] args){
          try {
            Scanner ip = new Scanner(System.in);
            int a = ip.nextInt();
                System.out.println("a = " + a);

                int val = 100 / a;

                int arr[] = {5};

                 arr[10] = 20;

          } catch (ArithmeticException e) {
                    System.out.println("Exception is : " + e.getMessage());            
          }catch(ArrayIndexOutOfBoundsException e){
              System.out.println(e.getMessage());
          }
          finally{
            System.out.println("other code");
          }
    }
}










// public class exceptions {
//     public static void main(String[] args) {
//         try {
//             int a= 10, b = 0;
//             System.out.println(a/b);
//         } catch (ArithmeticException e) {
//             System.out.println("The exception has occured is : "+e.getMessage());
//         }
//         finally{
//             System.out.println("wether the exception is handeld or not the finally block will be executed");
//         }
//     }
// }
