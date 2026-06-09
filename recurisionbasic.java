//print the name n noum of times




import java.util.*;
public class recurisionbasic {
 
    public void f(int i,int n){
    if(i>n){
        return;
    }


    System.out.println("Ajay");
    f(i+1,n);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.err.println("enter how many times to print");

        recurisionbasic obj = new recurisionbasic();
        obj.f(1,n);
    }
}










// public class recurisionbasic {
//  int cnt=0;
//     public void fun(){
//         if(cnt==5){
//             return ;
//         }

//         System.out.println(cnt);
//         cnt++;
//         fun();
//     }

 
 
 
//     // public void fun(){
//     //     System.out.println(1);
//     //     fun();
//     // }
//     public static void main(String[] args) {
//        recurisionbasic aj = new recurisionbasic();
//         aj. fun();
//     }
// }
