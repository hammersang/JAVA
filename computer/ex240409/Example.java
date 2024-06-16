package kr.ac.ync.computer.ex240409;

import kr.ac.ync.computer.ex240327.Main;

import java.lang.reflect.Member;

interface MemberService{
    void a();
    void b();
    void c();
    void d();
}
class MemberService1 implements MemberService{

    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }
}

class Shape{
    public void draw(){
        System.out.println("Shape : Draw()");
    }
}

class Line extends Shape{
    @Override
    public void draw() {
        System.out.println("Line : Draw()");
    }
}

public class Example {
    public static void main(String[] args) {
        MemberService1 memberService1 = new MemberService1();
        memberService1.a();

        Shape shape = new Line();
        shape.draw();
        Line line = new Line();
        line.draw();
        Shape shape1 =  line;
        shape1.draw();
    }
}
