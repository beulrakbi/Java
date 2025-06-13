package array;

public class Array8 {
    public static void main(String[] args) {
        //로또 번호 만들기
        /*
        번호 범위: 로또 번호는 1부터 45까지의 정수 중에서만 뽑는다.

        번호 개수: 총 6개의 번호를 뽑는다.

        중복 금지
         */

        int[] ball = new int[45];// 45개의 정수값을 저장하기 위한 배열 생성

        //각 요소에 1~45의 값 저장
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i+1;
//            System.out.println(ball[i]);
        }

        int temp = 0;
        int j = 0;
        for (int i = 0; i < 6; i++) {
            j=(int)(Math.random()*45);
            temp = ball[j];
            ball[j] = ball[i];
            ball[i] = temp;
        }

        for (int i = 0; i <6; i++) {
            System.out.println(ball[i]);
        }
    }
}
