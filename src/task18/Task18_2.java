package task18;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task18_2 {
    public static void main(String[] args) {
        Map<String, StringBuilder> users = new HashMap<>();
        users.put("1", new StringBuilder("Alexey"));
        users.put("2", new StringBuilder("Alina"));
        users.put("3", new StringBuilder("Sasha"));
        users.put("4", new StringBuilder("Kirill"));
        users.put("5", new StringBuilder("Nastiya"));
        users.put("6", new StringBuilder("Olga"));
        List<String> keys = users.keySet().stream()
                .filter(x -> x.equals("1"))
                .filter(x -> x.equals("2"))
                .filter(x -> x.equals("5"))
                .filter(x -> x.equals("8"))
                .filter(x -> x.equals("9"))
                .filter(x -> x.equals("13"))
                .reduce((users.values().stream().map(s -> s.reverse()).toList()));
        System.out.println(keys);

    }
}
