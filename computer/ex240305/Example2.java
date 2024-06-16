package kr.ac.ync.computer.ex240305;

public class Example2 {
    public static void main(String[] args) {
        //ctrl + d , Ctrl + shift+방향키, ctrl+shift+l
//        int a, b;
//        a = 1;
//        b = ++a;
//        System.out.printf("a = %d, b = %d", a, b);
        int x = 5;
        int y = 3;
//        int s;
//        if(x > y){
//            s = 1;
//        }else{
//            s = -1;
//        }
//        int s = (x>y)?1:-1;
        int z = 10;
//        if(x>y){
//            if(x>z) s = 1;
//            else s = 2;
//        }else{
//            s = -1;
//        }
        int s = (x>y)?(x>z)?1:2:-1;

        System.out.println(s);
    }
}
