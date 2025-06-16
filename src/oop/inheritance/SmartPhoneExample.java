package oop.inheritance;
/*
상속: 부모가 자식에게 물려주는 행위
목적: 중복되는 코드를 줄여 개발 시간을 단축시킨다.

 */
public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println(myPhone.model);
        System.out.println(myPhone.color);

        System.out.println("와이파이 상태" + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice(" 안녕하세요 ");
        myPhone.receiveVoice("안녕하세요 저는 홍길동입니다.");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
