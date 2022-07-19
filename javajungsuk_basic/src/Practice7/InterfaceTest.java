package Practice7;


class A {
//    public void method(B b) {} //인스턴스 변수를 계속 변경해야한다.
    public void method(I i) { // 인터페이스 I를 구현한 것만 들어와라.
        i.method();
    }
}

interface I {
    public void method();
}

class B implements I {
    public void method() {
        System.out.println("B클래스의 메서드");
    }
}


class C implements I{
    public void method() {
        System.out.println("C클래스의 메서드");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B()); // A가 B를 사용(의존)
        a.method(new C()); // 위에 class A의 매개변수도 변경해주어야 한다..
    }
}
