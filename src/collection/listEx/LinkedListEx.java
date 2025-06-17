package collection.listEx;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        //LinkedList생성
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        //중간에 삽입
        list.add(1, "D"); //1번 인덱스에 D 삽입
        System.out.println("전체 리스트" + list);

        //맨 앞/뒤 요소 삽입
        list.addFirst("E");
        list.addLast("F");
        System.out.println("앞/뒤 추가 후" + list);

        //요소 접근
        System.out.println("2번 인덱스:" +list.get(2));

        list.remove(1); //인덱스를 이용해서 삭제
        list.remove("E"); //값을 통해서 삭제
        System.out.println("삭제 후:" + list);

        System.out.println("크기: " + list.size());
    }
}
