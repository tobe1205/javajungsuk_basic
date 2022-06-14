package Practice6.Practice6_6;
//연습문제 6-4에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서드로 정의하시오

class MyPoint{
    //인스턴스 변수 x, y
    int x;
    int y;

    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1){ //인스턴스 메서드
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
    }
}
public class Ex_6_6 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        //p와(2,2)의 거리를 구한다.
        System.out.println(p.getDistance(2,2));
    }
}
