package homework.lesson5_HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String str = "LesiaisafraidofJava";
        LinkedHashMap<Character, Integer> testHashMap = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!testHashMap.containsKey(c)) {
                testHashMap.put(c, 1);
            } else {
                int cnt = testHashMap.get(c);
                cnt++;
                testHashMap.put(c, cnt);
            }
        }

        for (Map.Entry<Character, Integer> entry : testHashMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
