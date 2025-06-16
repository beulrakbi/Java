package oop.classStructure;

public class Student {
    //클래스 영역
    static String schoolName = "GPT 고등학교"; //static 모든 객체가 공유한다.
    String name;
    int grade;

    //생성자 영역
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    //메서드 영역
    void introduce() {
        System.out.println("이름:" + name + ", 학년:" + grade);
    }
    //메서드 영역
    //static 사용한 메서드는 객체를 생성하지 않고 이름만으로 호출할 수 있는 메서드 static의 특성으로 연결을 안해도 연결되어있음
    static void printSchoolName(){
        System.out.println("학교이름:" + schoolName);
    }
}
//속성중에 공통적인 것에 static을 붙여서 사용한다.  static을 쓴 경우에는 참조할 때 풀네임.height = 300; 사용할 것
//개별적인 것은 static을 안붙임