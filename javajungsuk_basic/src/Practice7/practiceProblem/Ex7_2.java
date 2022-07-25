package Practice7.practiceProblem;


class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        //7_1 정답
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

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
