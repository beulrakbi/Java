package array;

public class Array7 {
    public static void main(String[] args) {
        //최대값 최소값 구하기
        int[] score = new int[]{10, 20, 30, 40, 50};

        int max = score[0];
        int min = score[0];

        for (int i = 0; i < score.length; i++) {
            if(score[i]> max){
                max = score[i];
            }
            if(score[i]<min){
                min = score[i];
            }
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
