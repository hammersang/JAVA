package kr.ac.ync.computer.ex240409;

public interface a {
    public static final int t = 10;
    public abstract void send();
    public abstract void ad();
    public default void print() { //인터페이스여도 default는 구현 가능함
        System.out.println("a");
    };
    //private 인터페이스 내에 메소드에 의해서만 호출 가능
    //static 메소드 public private 모두 지정 가능
    //extends 인터페이스 끼리 상속할때 사용
    //implements 클래스가 인터페이스에게 상속 받을때
}
