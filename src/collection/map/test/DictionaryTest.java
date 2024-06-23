package collection.map.test;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("== 단어 입력 단계 ==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q') : ");
            String engInput = sc.nextLine();
            if (engInput.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String korInput = sc.nextLine();
            map.put(engInput, korInput);
        }

        System.out.println("== 단어 검색 단계 ==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q') : ");
            String engInput = sc.nextLine();
            if (engInput.equals("q")) {
                break;
            }

            if (map.containsKey(engInput)) {
                String koreanMeaning = map.get(engInput);
                System.out.print(engInput + "의 뜻 : " + koreanMeaning);
            } else
                System.out.println(engInput + "은(는) 사전에 없는 단어입니다.");
        }
    }
}
