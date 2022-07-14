package Practice7;

class Product2 {
    int price; //제품가격
    int bonusPoint; //제품구매시 제공하는 보너스 점수

    public Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product2() {} //기본 생성자
}

class Tv2 extends Product2 { //조상클래스 생성자 Product2를 호출.
    Tv2(){super(100);}
    public String toString(){return "Tv";}
}
class Computer2 extends Product2 {
    Computer2() { super(200);}
    public String toString(){return "Computer";}
}

class Audio2 extends Product2 {
    Audio2(){super(50);}
    public String toString(){return "Audio";}
}

class Buyer2 { //고객
    int money = 1000; //소지금
    int bonusPoint = 0; //보너스점수
    Product2[] cart = new Product2[10]; //구입한 제품을 저장하기위한 배열
    int i = 0; //Product배열에 사용할 카운터

    void buy(Product2 p) { //물품구매
        if(money < p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
        }
        money -= p.price; //가진 돈에서 구입한 제품의 가격 차감
        bonusPoint += p.bonusPoint; //보너스포인트 추가
        cart[i++] = p; //제품을 Product2[] cart에 저장
        System.out.println(p+"을/를 구입하셨습니다.");
    }

    void summary(){ //구매한 물품 정보 요약
        int sum = 0; //구입한 물품의 가격합계
        String itemList = ""; //구입한 물품 목록

        for (int i = 0; i < cart.length; i++) {
            if(cart[i] == null){
                break;
            }
            sum += cart[i].price;
            itemList += cart[i]+", ";
            // itemList += cart[i].toString()+", ";
        }
        System.out.println("구입하신 물품의 총금액은 " +sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class Ex7_9 {
    public static void main(String[] args) {

        Buyer2 b = new Buyer2();

        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());

        b.summary();
    }
}
