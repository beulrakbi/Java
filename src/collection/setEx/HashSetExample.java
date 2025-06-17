package collection.setEx;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        // 요소 추가
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana"); // 중복

        // 출력
        System.out.println("과일 목록: " + fruits);

        // 포함 여부 확인
        System.out.println("Apple이 있나요? " + fruits.contains("Apple"));

        // 요소 제거
        fruits.remove("Orange");

        // 반복문
        for (String fruit : fruits) {
            System.out.println("과일: " + fruit);
        }

        // 크기 확인
        System.out.println("총 과일 개수: " + fruits.size());
    }
}
