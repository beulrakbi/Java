package array;

public class Array5 {
    public static void main(String[] args) {
        //배열의 초기화
        //배열은 생성과 동시에 0으로 자동 초기화된다.
        //원하는 값을 하나씩 넣어줄 수 있다.
        int[] score = new int[5];
        score[0] = 1;
        score[1] = 2;
        score[2] = 3;
        score[3] = 4;
        score[4] = 5;
        //위 방법을 통해서 배열에 값을 넣어줄 수 있지만 배열의 크기가 많아지면 결국 배열을 쓰고도 편하게 코드를 작성할 수 없다.
        //그래서 for문을 활용해 배열을 효율적으로 사용할 수 있다.

        int[] score1 = new int[5];
        for(int i=0; i<score1.length; i++) {
            score1[i] = i;
            System.out.println(score1[i]);
        }

        //하지만 for문을 통해서 값을 배열에 넣을 때는 일정한 규칙이 있는 경우에만 사용 가능하다.
        //그런 경우에는 배열 선언, 생성과 동시에 초기화까지 동시에 진행한다.
        //{}중괄호 안에 값의 개수만큼 길이가 정해지기 때문에 [] 안에 배열의 크기를 적어주지 않아도 된다.
        int[] score2 = new int[]{10, 20, 30, 40, 50};

        //추가적으로 배열을 초기화할 때 new int를 생략할 수 있다.
        int[] score3 = {10, 20, 30, 40, 50};

        //하지만 배열의 선언과 초기화를 따로 구분지어 하는 경우에는 new int[]를 생략할 수 없다.
        int[] score5;
        //score = {10, 20} X
        score = new int[]{10, 20};
    }
}
