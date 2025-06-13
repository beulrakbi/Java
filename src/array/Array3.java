package array;

public class Array3 {
    public static void main(String[] args) {
        //배열의 인덱스

        //생성된 배열의 각 저장공간을 배열의 요소라고 한다.
        //접근하는 방식은 '배열이름[인덱스]'로 접근할 수 있다.
        //주의할 점은 인덱스는 1부터 시작이 아닌 0부터 시작이다.

        //배열 값 넣기
        int[] score = new int[5];

        score[0] = 1;
        score[1] = 2;
        score[2] = 3;
        score[3] = 4;
        score[4] = 5;

        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);
        System.out.println(score[4]);

        //배열 기능 2
        //배열을 사용하면 상수 대신 변수나 수식도 사용 가능하다.
        for (int i = 0; i < 5; i++) {
            score[i] = score[i] * 10;
            System.out.println(score[i]);
        }
    }
}
