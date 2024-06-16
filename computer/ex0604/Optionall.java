package kr.ac.ync.computer.ex0604;

import kr.ac.ync.computer.ex0528.Nation;

import java.util.Optional;
import java.util.stream.IntStream;

public class Optionall {
    public static void main(String[] args) {
        String s1 = "안녕"; // or String s1 = null;
//        Optional<String> o = Optional
        IntStream.of(1,2,3,4,3,2,2)
        .filter(i-> i % 2 == 0)
                .distinct()
                        .forEach(Util::print);

        System.out.println("\n인구가 1억(100백만) 이상의 2개 나라 :");
        Nation.nations.stream()
                .filter(p->p.getPopulation() > 100)
                .limit(2) //.skip(2)
                .forEach((Util::printWithParenthesis));
    }
}
