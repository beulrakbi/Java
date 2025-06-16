package oop.constructor;
//생성자 존재 이유: 객체 생성 시 필드에 값을 초기화 하기 위해서
//데이터 없이는 객체를 못만들게 제한
//new 클래스이름() 이렇게 생성하려면 그 클래스에 기본 생성자가 필수적으로 있어야 한다.
//클래스에 생성자가 하나도 없으면 자동으로 기본생성자가 생성된다. 하지만 하나도 없는 경우 직접 써줘야 한다.
public class Person {
    private String name;
    private int age;

    //기본 생성자
    public Person() {
    }

    //매개변수가 있는 생성자

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //출력용 메서드
    public void printInfo(){
        System.out.println("Name: " + name + " Age: " + age);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.printInfo();

        //매개변수가 있는 생성자 사용
        Person person1 = new Person("John", 22);
        person1.printInfo();
    }
}
