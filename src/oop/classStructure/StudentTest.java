package oop.classStructure;

public class StudentTest {
    public static void main(String[] args) {
        Student.printSchoolName();

        Student s1 = new Student("지민", 1);
        Student s2 = new Student("하늘", 2);

        s1.introduce();
        s2.introduce();
    }
}
