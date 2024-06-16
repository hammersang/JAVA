package kr.ac.ync.computer.ex0604;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map3Demo {
    public static void main(String[] args) {
        List<String> list1 = List.of("안녕, 자바!","잘 가, C++!");
        list1.stream().flatMap(s -> Arrays.stream(s.split(" ")))
        //"안녕, 자바!","잘 가, C++" -> [0]안녕, [1]자바!   [0]잘 [1]가, [2]C++!
                .forEach(Util::printWithParenthesis);
        System.out.println();
        //flatMap은 평탄화 작업
//        Stream<List<String>> s3 = Stream.of(list1, list2, list3);
//        Stream<String> s4 = s3.flatMap(list -> {
//            if (list.size() > 1)
//                return list.stream();
//            else
//                return  list.em
//        })
    }
}
