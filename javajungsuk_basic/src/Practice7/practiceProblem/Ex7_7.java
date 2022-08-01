package Practice7.practiceProblem;

/*
Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.
 */
class Outer2 {
    static class Inner2 {
        int iv = 200;
    }
}

public class Ex7_7 {
    public static void main(String[] args) {

        // 7-6과는 다르게 내부변수가 static 지역변수이기때문에 외부클래스의 인스턴스를 생성할필요없이
        //내부 인스턴트를 생성 후 바로 호출 할 수 있다.
        Outer2.Inner2 ii2 = new Outer2.Inner2();
        System.out.println(ii2.iv);

    }
}
