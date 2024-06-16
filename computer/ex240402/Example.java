package kr.ac.ync.computer.ex240402;

class A {

    int a;
    public A(){
        System.out.println("A생성자");
    }
}

class B extends A{
    int b;
    public B(){
        System.out.println("B생성자");
    }
}


public class Example {
    public static void main(String[] args) {
        B b = new B();
        b.a = 10;
        System.out.println(b.a);
        A a = b;
        a.a = 11;
        System.out.println(b.a);
        B c = (B) a;
    }
}
