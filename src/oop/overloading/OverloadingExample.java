package oop.overloading;

public class OverloadingExample {
    //두 정수를 더하는 메서드
    int add(int a, int b) {
        return a + b;
    }

    // 세 정수를 더하는 메서드
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // 두 실수를 더하는 메서드
    double add(double a, double b) {
        return a+b;
    }
    public static void main(String[] args) {
        OverloadingExample o = new OverloadingExample();
        System.out.println(o.add(10, 20));
        System.out.println(o.add(10, 20, 30));
        System.out.println(o.add(1.5, 2.5));
    }
}
