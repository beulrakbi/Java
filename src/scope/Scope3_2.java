package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if (m>0){
            int temp = m*2;
            System.out.println("temp =" +temp);
        }//temp가 종료되면서 관리해야 할 변수가 적어지고 코드가 더 간단해짐
        System.out.println("m =" +m);
    }
}
