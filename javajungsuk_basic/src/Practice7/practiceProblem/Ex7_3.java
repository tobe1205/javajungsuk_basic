package Practice7.practiceProblem;
//다음의 코드는 컴파일하면 에러 발생
//그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는가?

class Product {
    int price; //가격
    int bonusPoint; //제품구매 시 제공하는 보너스점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    //정답 : 기본 생성자()가 없기때문에 에러 발생
    /*
    Tv 클래스의 인스턴스를 생성할 때 Tv()가 호출되고 Tv()는 조상 생성자 super()를 호출한다.

    추가된 super()는 조상클래스인 의 기본 생성자 를 호출하는 것인데 Product클래스에는
    기본 생성자 가 정의되어 있지 않다 정의되어 있지 않은 생성자를 호출하니까
    에러가 발생하는 것이다 클래스에는 이미 . Product Product(int price)
    라는 생성자가 정의되어 있기 때문에 컴파일러가 자동적으로 추가해 주지도 않으므로 직접
    클래스에 를 넣어주면 문제가 해결된다 Product Product(){} .
     */
    Product() {
    }
}

class Tv extends Product {
    Tv() {
    }

    ;

    public String toString() {
        return "Tv";
    }
}

public class Ex7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
