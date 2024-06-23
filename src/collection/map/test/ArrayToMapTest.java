package collection.map.test;

import java.util.HashMap;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},
                {"JPA", "30000"}};


//        주어진 배열로부터 Map 생성 - 코드 작성

        HashMap<String, String> hashMap = new HashMap<>();

        for (String[] product : productArr) {
            hashMap.put(product[0], product[1]);
        }

//        Map의 모든 데이터 출력 - 코드 작성

        for (String key : hashMap.keySet()) {
            System.out.println("제품: " + key + ", 가격 " + hashMap.get(key));
        }
    }
}
