package Practice6.Practice6_4;

public class Ex_6_4 {
    //두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
    static double getDistance(int x, int y, int x1, int y1) {
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1)); // x, y는 지역변수
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }

    /*
제곱근 계산은 클래스의 를 사용하면 된다 제곱도 Math sqrt(double a) . Math.pow(double
a, double b) , 2 . 를 사용하면 되지만 제곱이므로 그냥 곱셈연산자를 사용했다 어느 쪽을
사용해도 괜찮지만 메서드를 호출하는 것은 곱셈연산보다 비용이 많이 드는 작업이라는 ,
것은 기억해두자
그렇다고 해서 보다 빠른 코드를 만들겠다고 코드를 복잡하게 하는 것은 좋지 않다.
참고로 를 사용한 코드는 다음과 같다 Math.pow(double a, double b) .

return Math.sqrt(Math.pow(x-x1,2) + Math.pow(y-y1,2));
     */
}
