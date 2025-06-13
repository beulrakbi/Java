package array;

public class Array4 {
    public static void main(String[] args) {
        //배열의 길이

        int[] arr = new int[5];
        //arr 배열을 선언하고 5칸의 배열을 생성했다.
        //배열의 길이를 확인하기 위해서 length를 통해 배열 길이의 정보를 얻을 수 있다.
        int tmp = arr.length;
        System.out.println(tmp);
        //length는 상수다. 값을 조회할 수 있지만 변경할 수는 없다.

        //반복문에서 length 사용하기
        //1번 예시
        //6개의 공간을 만들어 0부터 5까지의 인덱스를 출력하고있다. 에러 없이 잘 출력된다.
        int[] score = new int[6];
        for (int i = 0; i < 6; i++) {
            score[i] = i;
            System.out.println(score[i]);
        }

        //2번 예시
        //배열을 6을 5로 변경하였을 때
        /*
        int[] score2 = new int[5];
        for (int i=0; i<6; i++){
            System.out.println(score2[i]);
        }
         */
        // 에러가 발생한다 : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //	at array.Array4.main(Array4.java:26)
        //배열의 크기는 5칸이지만 for문을 통해 6칸을 조회하면서 생기는 오류이다,

        //3번 예시
        //조건식에서 상수로 인덱스의 값을 사용하기 보다는 length를 사용해서 배열의 길이를 사용하면 훨씬 코드가 효율적이다.
        //배열의 크기를 변경해도 length가 배열의 크기를 읽기때문에 자유롭게 배열의 크기를 변경해도 괜찮다.
        int[] score3 = new int[5];
        for(int i=0; i<score3.length; i++){
            score3[i] = i;
            System.out.println(score3[i]);
        }
    }
}
