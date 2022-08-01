package Practice7.practiceProblem;
/*
Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.
 */

class Outer {
    class Inner {
        int iv = 100;
    }
}

public class Ex7_6 {
    public static void main(String[] args) {

        /*
        외부클래스의 인스턴스부터 생성해야하므로 Outer 인스턴스부터 생성
        그리고 내부인스턴스를 생성한 뒤 출력
         */
        Outer o = new Outer();
        Outer.Inner ii = o.new Inner();
        System.out.println(ii.iv);

    }
}
