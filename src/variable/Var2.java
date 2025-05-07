package variable;

public class Var2 {
    public static void main(String[] args) {
        int a; //변수 선언
        a = 20; //변수 초기화 10 ->20
        // = 기호는 같다는 뜻이 아닌 대입 기호

        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        //Var1에서는 print 구문에 10을 20으로 세 번 변경했다. 변수를 사용하면 변수 초기화 하나만 해주면 10 세 번을 20 세 번으로 출력 가능하다.
        //자바가 실행 시점에 변수의 값을 읽어서 사용한다.
    }
}