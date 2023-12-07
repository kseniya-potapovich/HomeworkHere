package task18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task18_2 {
    public static void main(String[] args) {
        Map<Integer, StringBuilder> users = new HashMap<>();
        users.put(1, new StringBuilder("Alexey"));
        users.put(2, new StringBuilder("Alina"));
        users.put(3, new StringBuilder("Sasha"));
        users.put(4, new StringBuilder("Kirill"));
        users.put(5, new StringBuilder("Nastiya"));
        users.put(6, new StringBuilder("Olga"));

        List<Integer> keys = users.keySet().stream()
                .filter(x -> x==1 || x==2 || x==5 || x==8 || x==9 || x==13)
                .toList();
        for (int i =0 ;i < keys.size();i++){
            System.out.println(users.get(keys.get(i)).reverse());
        }
    }
}
