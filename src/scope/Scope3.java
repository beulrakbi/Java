package scope;

public class Scope3 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; //temp는 if문 안에서만 위치하면 된다. 굳이 if문 밖에서 사용할 필요 없다. 메모리 낭비
        if (m>0){
            temp = m*2;
            System.out.println("temp =" +temp);
        }
        System.out.println("m =" +m);
    }
}
