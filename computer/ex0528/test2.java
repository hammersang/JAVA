package kr.ac.ync.computer.ex0528;

import java.util.Arrays;
import java.util.Objects;

public class test2 {
    public static void main(String[] args) {
        Arrays.stream(new String[]{"a1", "b1", "c1", "c2", "c3"}).filter(x->x.matches("c.*"))
                .forEach(x-> System.out.print(x+" "));

    }
}
