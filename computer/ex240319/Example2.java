package kr.ac.ync.computer.ex240319;

import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        int[][] array1 = new int[4][4];
        Random random = new Random();
        for(int i = 0; i <8 ;i++){
           int number = random.nextInt(10)+1;
           while(true){
              int j = random.nextInt(4);
              int z = random.nextInt(4);
               if(array1[j][z] == 0){
                   array1[j][z] = number;
                   break;
               }
            }

        }
        for(int i = 0; i < 4 ; i++){
            for(int j = 0; j <4; j++){
                System.out.print(array1[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
