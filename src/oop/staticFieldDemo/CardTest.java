package oop.staticFieldDemo;
//오버로딩 조건
//1. 메서드 이름이 같아야 한다.
//2. 매개변수의 개수 또는 타입이 달라야 한다.
//3. 반환 타입은 영향이 없다.
public class CardTest {
    public static void main(String[] args) {
        System.out.println("card width" + Card.width);
        System.out.println("card height" + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = "A";

        Card c2 = new Card();
        c2.kind = "Diamond";
        c2.number = "B";

        System.out.println(c1.kind);
        System.out.println(c1.number);
        System.out.println();
        System.out.println(c2.kind);
        System.out.println(c2.number);
//        c1.width = 150;
//        c1.height = 150;   static을 참조할 때는 인스턴스명을 사용하지 않고 클래스명을 직접 사용하는게 좋다.



    }
}
