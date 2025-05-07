package variable;

public class Var3 {
    public static void main(String[] args) {
        int a; //변수 선언
        a = 10; //변수 초기화
        System.out.println(a);
        a = 50; // a는 10 -> 50
        //프로그램은 위에서부터 아래로 작동한다.
        System.out.println(a);
        //기존의 값인 10은 없어진다.
    }
}
