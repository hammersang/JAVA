package kr.ac.ync.computer.ex240319;

class Member{
    int age;
    String name;
}

public class Example1 {
    public static void main(String[] args) {
        int [] [] array = new int[5][5];
        int count = 1;
        for (int i =0; i <array.length; i++){
            for (int j = 0 ; j <array.length; j++){
                array[i][j] = count++;
            }
        }
        for (int i =0; i <array.length; i++){
            for (int j = 0 ; j <array.length; j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }


    }
}
