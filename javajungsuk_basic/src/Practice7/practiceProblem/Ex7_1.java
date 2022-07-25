package Practice7.practiceProblem;


class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        //7_1 정답
        for (int i = 0; i < cards.length; i++) { //cards의 크기만큼 반복 수행
//            0~19까지의 숫자가 변하는 동안 원하는 num의 값을 얻으려면, i % 10 + 1 계산식을 사용한다.
            int num = i % 10 + 1; // 0~9까지. 카드는 1부터 시작이기때문에 +1을 해준다.
          /*  20장의 카드 -> 1~10까지 카드 한쌍씩 있고 숫자가 1, 3, 8 인경우 둘중의
              한 장은 K이어야 한다. */
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

            //cards배열안에 각각 숫자와 true&false값을 저장한다.
            cards[i] = new SutdaCard(num, isKwang);

        }
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    //info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Ex7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }

    }
}
