package oop.constructor.thisPackage;
/*
this와 this()는 다르다.
1) this 인스턴스 자기 자신을 가리킴. 보통 필드와 매개변수 이름이 같을 때 구분할 때 사용 this.name = name
2) this() 같은 클래스의 다른 생성자를 호출할 때 사용 반드시 생성자의 첫 줄에 써야 함 this("홍길동", 20)
 */
public class Student {
    private String name;
    private int age;

    public Student() {
//        System.out.println("기본 생성자 호출됨"); this를 쓸거면 생성자 첫 줄에 써야 함
        this("이름 없음", 0);
        System.out.println("기본 생성자 호출됨");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("매개변수 생성자 호출됨");
    }

    public void printInfo(){
        System.out.println("이름" + name + "나이" + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("홍길동", 23);

        s1.printInfo();
        s2.printInfo();

    }
}
