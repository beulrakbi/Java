package oop.polymorphism;
//다형성: 부모 타입으로 다양한 자식 객체를 다루는 능력
class Animal {
    public void speak() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("야옹!");
    }
}

public class ex {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.speak(); // 업캐스팅 : 자식 클래스 객체를 부모 타입으로 참조하는 것
        a2.speak(); //업캐스팅

//        배열로 다형성 활용
        Animal[] animals = {new Dog(), new Cat(), new Dog()};
        for(Animal a : animals){
            a.speak();
        }
    }
}
