package Practice6.Practice6_21;
/*
다음과 같이 정의된 메서드를 작성하고 테스트하시오
-메서드명 : abs
-기능 : 주어진 값의 절대값을 반환한다.
-반환타입 : int
-매개변수 : int value
 */

public class Main {
    public static int abs(int value){
        /*
        삼항연산자 사용 value값이 0보다 크면 그대로,
        0보다 작으면 -를 붙어서 나오게 한다.
         */
        return value > 0 ? value : -value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value+"의 절대값 :"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값 :"+abs(value));
    }
}
