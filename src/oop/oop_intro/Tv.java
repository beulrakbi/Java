package oop.oop_intro;

class ExTv{
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은" + t.channel + "입니다.");
    }
}

public class Tv {
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channel(int channel) {++channel;}
    void channelDown() {--channel;}
}
