package Practice7.Practice7_overrideTest;

//오버라이딩 예제

class MyPoint3 extends Object {
    int x;
    int y;

    MyPoint3(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "x:" + x + ", y:" + y;
    }
    String getLocation() {
        return "x:" + x + ", y:" + y;
    }
}

/*
class MyPoint3D extends MyPoint3 {
    int z;

    //조상의 getLocation()을 오버라이딩
    String getLocation() {
        return "x:" + x + ", y:" + y + ", z:" + z;
    }
}
*/

public class OverrideTest {
    public static void main(String[] args) {
//        MyPoint3D p = new MyPoint3D();
        MyPoint3 p3 = new MyPoint3(2, 3);
        System.out.println(p3);
//        p.x = 3;
//        p.y = 5;
//        System.out.println(p.getLocation());
//        System.out.println(p); //(println(p.toString())과 같다.

    }
}
