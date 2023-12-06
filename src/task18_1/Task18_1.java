package task18_1;

import java.util.ArrayList;

public class Task18_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(15);
        list.add(51);
        list.add(34);
        list.add(17);
        list.add(48);
        list.add(1);
        list.add(15);
        list.add(24);
        Integer i = list.stream()
                .distinct()
                .filter(number -> number % 2 == 0)
                .reduce(Integer::sum).orElse(0);
        System.out.println(i);
    }
}
