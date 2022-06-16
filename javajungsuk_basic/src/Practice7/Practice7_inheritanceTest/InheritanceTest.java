package Practice7.Practice7_inheritanceTest;

//extends Object 작성하지않더라도 컴파일러에서 자동으로 추가해준다.
class MyPoint {
    int x;
    int y;
}

/*class Circle extends MyPoint { //상속
    int r;
}*/
class Circle {
    MyPoint p = new MyPoint();
    int r;
}

    public class InheritanceTest {
        public static void main(String[] args) {

            Circle c = new Circle();
            /*
            c.x = 1;
            c.y = 2;

            System.out.println("c.x = " + c.x);
            System.out.println("c.y = " + c.y);
             */
            c.p.x = 1;
            c.p.y = 2;
            c.r = 3;
            System.out.println("c.p.x = " + c.p.x);
            System.out.println("c.p.y = " + c.p.y);
            System.out.println("c.r = " + c.r);

//            Circle c2 = new Circle();
//            System.out.println(c.toString());
//            System.out.println(c2); //위 toString()과 같다.
        }
    }

