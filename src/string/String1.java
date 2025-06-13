package string;

public class String1 {
    public static void main(String[] args) {
        //문자열을 저장하는 타입은 String이다.
        //String은 char배열에 메서드를 추가한 것이다.

        // char String 차이
        // String 객체는 읽을 수만 있을 뿐 내용을 변경할 수 없다는 것이 char과의 차이이다.
        String str = "Java";
        str = str + "8";
        System.out.println(str);
        //위 코드는 변경되는 것 같지만, 문자열은 변경할 수 없으므로 새로운 내용의 문자열이 생성되는 것이다.

        //쉽게 예를 들자면 종이에 볼펜으로 글을 쓰고 java라고 작성했다 볼펜으로 작성했기 때문에 수정이 불가능해서 다른 종이에 새롭게 java8이라고 적은것과 같은 의미다.
    }
}
