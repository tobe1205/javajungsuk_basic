package Practice7.practiceProblem;


class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        //7_1 정답
        for (int i = 0; i < cards.length; i++) { //cards의 크기만큼 반복 수행
//            0~19까지의 숫자가 변하는 동안 원하는 num의 값을 얻으려면, i % 10 + 1 계산식을 사용한다.
            int num = i % 10 + 1; // 0~9까지. 카드는 1부터 시작이기때문에 +1을 해준다.
          /*  20장의 카드 -> 1~10까지 카드 한쌍씩 있고 숫자가 1, 3, 8 인경우 둘중의
              한 장은 K이어야 한다. */
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

            //cards배열안에 각각 숫자와 true&false값을 저장한다.
            cards[i] = new SutdaCard2(num, isKwang);

        }
    }
    //7_2 정답
    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * cards.length);

            SutdaCard2 tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }

    SutdaCard2 pick(int index) {
        if (index < 0 || index >= CARD_NUM) //index 유효성 검사
            return null;
        return cards[index];
    }

    SutdaCard2 pick() {
        int index = (int) (Math.random() * cards.length);
        return pick(index); //pick(int index)를 호출한다.
    }
}

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    //info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Ex7_2 {
    public static void main(String[] args) {
        SutdaDeck2 deck = new SutdaDeck2();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i].toString() + ",");
        }
        System.out.println();
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i].toString()+ ",");
        }

        System.out.println();
        System.out.println(deck.pick(0));

    }
}
