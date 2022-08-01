package Practice7.practiceProblem;

/*
다음과 같은 실행결과를 얻도록 (1)~(4)의 코드를 완성하시오.
 */

class Outer3 {
    int value = 10;

    class Inner3 {
        int value = 20;

        void method1() {
            int value = 30;

            System.out.println(value); // 1. 가장 가까운 value 값인 30
            System.out.println(this.value); // 2. 내부 인스턴스클래스 Inner3의 value 값인 20
            System.out.println(Outer3.this.value); // 3. 외부 클래스 Outer3의 value 값인 10
        }
    } //Inner3클래스의 끝
} // Outer3클래스의 끝

public class Ex7_8 {
    public static void main(String[] args) {

        // 4. 내부의 클래스를 불러오기 위해서는 외부의 인스턴스를 먼저 생성해야한다.
        Outer3 o2 = new Outer3();
        Outer3.Inner3 inner3 = o2.new Inner3(); //그다음에 내부클래스의 인스턴스 생성

        //내부 클래스의 인스턴스의 메서드 호출
        inner3.method1();

    }
}
