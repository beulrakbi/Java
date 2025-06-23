package oop.overriding;

class Point3 extends Object{
    int x;
    int y;

    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "x=" + x + "y=" + y;
    }
}

//class MyPoint3D extends Point3{
//    int z;
//
//    //조상의 getLocation()을 오버라이딩
//    String getLocation(){
//        return "x:" + x+ "y"+y + "z"+z;
//    }
//}


public class OverrideTest {
    public static void main(String[] args) {
        Point3 p = new Point3(3,5);
        p.x = 3;
        p.y = 5;
        System.out.println(p.toString());
        System.out.println(p);
    }
}
