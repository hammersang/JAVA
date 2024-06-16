package kr.ac.ync.computer.ex240319;

import java.util.Random;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int result2 = 0;
        int max =0;

        System.out.print("입력하시오: ");
        int num = scan.nextInt();
        int[][] array1 =new int[num][num];
        for(int i = 0; i<num ; i++){
            for(int j =0; j<num; j++){
                int c = random.nextInt(100)+1;
                array1[i][j] = c;
            }
        }
        for(int i = 0; i<num ; i++){
            int result1 =0;
            for(int j =0; j<num; j++){
                System.out.print(array1[i][j]+ " ");
                result1 = result1 + array1[i][j];
            }
            if(result2 < result1){
                result2 = result1;
                max = i+1;
            }
            System.out.println("[ "+(i+1)+"행의 합 : "+result1+"]");

        }
        System.out.println("최대값(MAX) 행은 "+max+"행 입니다.");
    }
}
