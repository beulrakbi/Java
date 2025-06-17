package collection.listEx;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //ArrayList는 가변 크기의 배열이다.
        //<String> = 제네릭 문법으로 String만 저장하겠다는 뜻

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //요소 출력
        System.out.println("all" + list);

        //특저어 위치 접근
        System.out.println("0 index" + list.get(0));

        //요소 삭제
        list.remove(0);
        System.out.println("delete index" + list.get(0));

        //크기 확인
        System.out.println("size " + list.size());

        //요소 포함 여부
        System.out.println("include B ? " + list.contains("B"));
    }
}
