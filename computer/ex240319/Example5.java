package kr.ac.ync.computer.ex240319;

public class Example5 {
    public static void main(String[] args) {
        C c = new C(10);
        c.increase(c);
        System.out.println(c.a);

//        C d = new C(20,30);
//        C [] f = new C[5];
//        int [] a = new int[4];
//        for(int i = 0; i<f.length;  i++){
//            f[i] = new C();
//        }


    }
}

class C{
    int a;
    int b;
    public C(int a){
        this(1,2);
        this.a = a;
    }
    public C(int a, int b){
        this.b = b;
    }
    public C(){

    }
    public void increase(C m){
        m.a++;
    }
}
