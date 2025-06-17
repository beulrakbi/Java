package collection.QueueEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println(queue);


        System.out.println(queue.peek()); //큐의 앞 요소 확인 없으면 null
        System.out.println(queue.poll()); //큐에서 앞 요소 제거 후 반환, 없으면 null
        System.out.println(queue);
    }
}
