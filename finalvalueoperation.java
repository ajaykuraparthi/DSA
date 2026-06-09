public class finalvalueoperation {
    public static void main(String args[]){
       
        String op[] ={"--x","++x","x++",};

            int x=0;

        for(int i = 0 ; i < op.length; i++){
          //  System.out.println(op[i]);

            String  temp=op[i];

          if((temp=="++x")||(temp=="x++")){
            x+=1;
          }
          else{
            x-=1;
          }
           
            
        }
       System.out.println(x);
    }
}
