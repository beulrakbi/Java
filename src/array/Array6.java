package array;

public class Array6 {
    public static void main(String[] args) {
        //총합과 평균 구하기
        //최대값 최소값

        int sum = 0;
        float avg = 0f;

        int[] score = {10, 20, 30, 40, 50};
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("합계 : " + sum);

        avg = sum / score.length;
        System.out.println("평균 : " + avg);

    }
}
