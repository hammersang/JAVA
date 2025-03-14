package kr.ac.ync.computer.ex0430;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        //Consumer는 반환 타입이 없다, toLowerCase : 소문자로 바꿔준다
        Consumer<String> c1 = x -> System.out.println(x.toLowerCase());
        c1.accept("Java Functional Interface");
        BiConsumer<String, String> c2 = (x, y) -> System.out.println(x + " : "+ y);
        c2.accept("Java", "Lambda");
        //ObjIntConsumer 는 첫번째는 제네릭이고, 두번째는 Int 라는 것이다.
        ObjIntConsumer<String> c3 = (s, x) -> {
            int a = Integer.parseInt(s) + x;
            System.out.println(a);
        };
        c3.accept("100", 50);
        IntConsumer c4 = x -> System.out.printf("%d * %d = %d\n", x, x, x * x);
        IntConsumer c5 = c4.andThen(x -> System.out.printf("%d + 10 = %d", x, x+10));
        c5.accept(10);
    }
}
