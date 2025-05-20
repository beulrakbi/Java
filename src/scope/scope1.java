package scope;

public class scope1 {
    public static void main(String[] args) {
        int m = 10; //m 생존 시작

        if (true){
            int x = 20; //x의 생존 시작
            System.out.println("if m =" +m); //m은 코드 전체에서 생존할 수 있다.
            System.out.println("if x =" +x);
        }
//        System.out.println("main x=" + x);//x는 if문 지역을 나와서 사용할 수 없다.
        System.out.println("if m =" +m);
    }//m 생존 종료
}
