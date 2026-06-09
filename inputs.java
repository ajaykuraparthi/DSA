import java.util.*;
public class inputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();  //for int input
       // String n=sc.nextLine(); //for String input
        //String n=sc.next();    //it store only until space

        // System.out.println(n+5); 



        //for array input

        // int arr[]=new int[5];
       
        // for(int i=0;i<arr.length;i++){
        //     int a=sc.nextInt();
        //     arr[i]=a;
        // }
       
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }



// int n=sc.nextInt();
// sc.nextLine();
// String s=sc.nextLine();
// System.out.println(n+" "+s);



//String array
// int n=sc.nextInt();
// sc.nextLine();
// String some[]=new String[n];

// for(int i=0;i<some.length;i++){
//     some[i]=sc.nextLine();
// }
// for(int i=0;i<some.length;i++){
//     System.out.println(some[i]);
// }
// sc.close();



int n= sc.nextInt();

for(int i=1;i<=10;i++){
    System.out.println(n+" x "+i+" = "+(i*n));

}
    }
}
