import java.util.ArrayList;
import java.util.List;

public class setMat {

    public static void main(String[] args) {
        //int 
    List<Integer> lst = new ArrayList<>();
        int matrix[][] = {{0,1,1},
                          {1,1,0},
                          {3,2,1}};

            int rowLen = matrix.length;
            int colLen = matrix[0].length;

                for(int i = 0; i < rowLen; i++){
                    for(int j = 0; j < colLen; j++){
                        if(matrix[i][j] == 0){
                            lst.add(i);
                            lst.add(j);
                        }
                    }
                    
                }
                for(int i = 0; i < lst.size();i+=2){
                       int first = lst.get(i);
                       int sec = lst.get(i+1);

                    for(int j = 0; j < colLen; j++){
                       matrix[first][j] = 0;

                    }
                    for(int k = 0; k < rowLen; k++){
                        matrix[k][sec] = 0;
                    }
                }

                for(int i = 0; i < rowLen; i++){
                    for(int j = 0; j < colLen; j++){
                        System.out.print(matrix[i][j] +" ");
                    }

                    System.out.println();
                }
               
    }
}