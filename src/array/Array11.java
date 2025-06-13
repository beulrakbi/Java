package array;

import java.util.Arrays;

public class Array11 {
    public static void main(String[] args) {
        //Arays

        //1. toString
        //1차원 배열을 문자열로 표현해주는 메서드
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));

        //2. deepToString
        //2차원 이상 배열을 사람이 읽기 쉽게 문자열로 바꿔주는 메서드
        int[][] arr2D = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println(Arrays.deepToString(arr2D));

        //3. equals
        //두 1차원 배열이 같은지 비교하는 메서드
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.equals(arr, arr2));
        //4. deepEquals
        //두 2차원 배열이 같은지 비교하는 메서드
        int[][] arr2D2 = {
                {1,6,3},
                {4,3,6}
        };
        System.out.println(Arrays.deepEquals(arr2D, arr2D2));

        //4.copyOf()
        //배열의 전체를 복사
        int[] cp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] cp1 = Arrays.copyOf(cp, cp.length);
        System.out.println(Arrays.toString(cp1));
        //5.copyOfRange()
        //배열의 일부를 복사해서 새로운 배열을 만들어 반환
        int[] cp2 = Arrays.copyOfRange(cp, 1, 3);
        System.out.println(Arrays.toString(cp2));

    }
}
