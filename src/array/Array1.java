package array;

public class Array1 {
    public static void main(String[] args) {
        //배열: 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
        //배열 사용 이유: 많은 양의 데이터를 다루는 경우 모든 데이터의 숫자만큼 변수를 선언하는 것은 매우 힘들기 때문에 배열을 사용하여
        //같은 타입을 하나로 묶어서 사용할 수 있다.

        /* 배열 사용 전 */
        int score1 = 90;
        int score2 = 45;
        int score3 = 75;
        int score4 = 81;
        int score5 = 83;

        System.out.println("점수");
        System.out.println("학생 1" + score1);
        System.out.println("학생 2" + score2);
        System.out.println("학생 3"+ score3);
        System.out.println("학생 4" + score4);
        System.out.println("학생 5" + score5);

        //위 코드를 보면 5명의 학생의 점수를 저장하고 하나씩 출력하고 있다. 지금은 5명이지만 학생이 20명만 넘어가도
        //비효율적인 코딩이 될것이다.
    }
}
