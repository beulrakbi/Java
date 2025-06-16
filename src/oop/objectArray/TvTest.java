package oop.objectArray;
class Tv {
    String color;
    int channel;

    void channelUp(){
        channel++;
    }

    void channelDown(){
        channel--;
    }
}

public class TvTest {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];

        for(int i = 0; i < tvArr.length; i++){
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 1 ;
        }

        for(int i = 0; i < tvArr.length; i++){
            System.out.println("tvArr[" + i + "] = " + tvArr[i].channel);
            tvArr[i].channelUp();
        }

        System.out.println("채널 증가 후");

        for(int i = 0; i < tvArr.length; i++){
            System.out.println("tvArr[" + i + "] = " + tvArr[i].channel);
        }
    }
}
