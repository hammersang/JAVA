package kr.ac.ync.computer.ex0604;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class parallelStream {
    public static void main(String[] args) {
        //Opyionsl<T> 객체 옵셔널 타입이다.
        OptionalInt i = OptionalInt.of(100);
        OptionalDouble d = OptionalDouble.of(3.14);
        Optional<String> s = Optional.of("apple");

        System.out.println(i.isPresent());
        System.out.println(i.getAsInt());
        System.out.println(d.getAsDouble());
        System.out.println(s.get());

        System.out.println(i);
        System.out.println(d);
        System.out.println(s);

        System.out.println(divide(1.0,2.0));
        System.out.println(divide(2.0,0.0));
    }
    public static OptionalDouble divide(double x, double y){
        return y ==0 ? OptionalDouble.empty() :
                OptionalDouble.of(x / y);
    }
}
