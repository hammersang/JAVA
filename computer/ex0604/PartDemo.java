package kr.ac.ync.computer.ex0604;

import kr.ac.ync.computer.ex0528.Nation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartDemo {
    public static void main(String[] args) {
        Stream<Nation> sn
                = Nation.nations.stream().limit(4);
        Map<Boolean, List<Nation>> m1
                =sn
                .collect(
                        Collectors.partitioningBy(
                                p-> p.getType() == Nation.Type.LAND
                        )
                );
        System.out.println(m1);
        sn = Nation.nations.stream().limit(4);
        Map<Boolean, Long> m2 = sn
                .collect(
                        Collectors.partitioningBy(
                                p -> p.getType() == Nation.Type.LAND,
                                Collectors.counting()
                        )
                );
        System.out.println(m2);
    }
}
