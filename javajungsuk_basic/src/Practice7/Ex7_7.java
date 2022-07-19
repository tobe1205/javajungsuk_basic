package Practice7;

class Car {
    String color;
    int door;

    void drive() { //운전하는 기능
        System.out.println("drive, brr~~~");
    }

    void stop() { //멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car { //car를 상속받는 소방차
    void water() { //물을 뿌리는 기능
        System.out.println("water!!!");
    }
}

public class Ex7_7 {
    public static void main(String[] args) {

        Car c = new Car();
        FireEngine fe = (FireEngine) c; //형변환 실행 에러 java.lang.ClassCastException 발생
//        fe.water(); //컴파일 오케이


/*        Car car = null;
        FireEngine fe = new FireEngine(); //실제 인스턴스가 무엇인지가 중요.
        FireEngine fe2 = null;


//
//        fe.water();
//        car = fe;
////        car.water(); // 컴파일 에러 Car타입의 참조변수인 car로는 water()사용 불가
//        fe2 =(FireEngine)car;
//        fe2.water();

        FireEngine fe3 = (FireEngine)car; //조상 -> 자손으로 형변환
        Car car2 = (Car)fe2; //자손 -> 조상으로 형변환
//        car2.drive(); //NullPointerException발생.*/
    }
}
