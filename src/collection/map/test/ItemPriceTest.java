package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ItemPriceTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        List<String> list = new ArrayList<>();
        for (String key : map.keySet()) {
            Integer i = map.get(key);
            if (i == 1000) {
                list.add(key);
            }
        }
        System.out.println("list = " + list);
    }
}
