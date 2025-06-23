package oop.inheritance;
class MyPoint{
    int x;
    int y;
}

//상속
//class Circle extends MyPoint{
//    int r;
//}

//포함
class Circle {
    MyPoint p = new MyPoint(); //참조변수 초기화
    int r;
}

public class InheritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.p.x = 1;
        c.p.y = 2;
        c.r = 3;

        System.out.println(c.p.x);
        System.out.println(c.p.y);
        System.out.println(c.r);
    }
}
