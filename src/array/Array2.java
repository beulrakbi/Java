package array;

public class Array2 {
    public static void main(String[] args) {
        //배열 선언과 생성
        //1. 선언
        //타입[] 변수이름;
        //타입 변수이름[];

        int[] score;
        String[] name;

        int score1[];
        String[] name1[];

        //배열을 선언은 생성된 배열을 다루기 위한 저장공간이므로 배열을 생성하는 과정이 필요하다.
        //2. 생성
        //타입[] 변수이름;
        //변수이름 = new 타입[길이]
        //배열을 생성하기 위해서는 new 연산자를 사용한다,
        int[] score2;
        score = new int[10];
        //이제 score2라는 공간에 10개의 정수형 타입 데이터가 들어갈 수 있는 것이다.

        //3. 선언과 생성 한 번에 하기
        //선언과 생성을 한 줄로 작성하여 코드를 간략하게 작성할 수 있다.
        int[] score3 = new int[10];
    }
}
