package kr.ac.ync.computer.ex0604;

import kr.ac.ync.computer.ex0528.Nation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingDemo {
    public static void main(String[] args) {
        Map<Nation.Type, List<Nation>> m1 = Nation.nations.stream().limit(4)
                .collect(Collectors.groupingBy(Nation::getType));
        System.out.println(m1);
        //collect에서 grouping 하면 그룹을 짓고 출력한다.

    }
}
