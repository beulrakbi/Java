package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; //-128~127
        short s = 32767; //-32,768 ~ 32,767
        int i = 2147483647; // 약 20억까지 사용 가능   **자주 사용
        long l = 9223372036854775807L; // 제일 긴 정수를 작성 가능 대문자 L을 붙여준다. 소문자 l은 권장x 1이랑 비슷

        //실수
        float f = 10.0f; //float은 f를 붙여야 함
        double d = 10.0; // float < double ** 자주 사용

        //기타
        char c = 'c'; //1 바이트 차지
        boolean bool = true; //1바이트 차지 ture, false만 사용
        String str = "abcdefg"; //문자열을 저장한다.
    }
}
