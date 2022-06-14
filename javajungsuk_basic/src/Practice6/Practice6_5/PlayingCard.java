package Practice6.Practice6_5;

//다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.

class PlayingCard {
    int kind;
    int num;

    static int width;
    static int height;

    PlayingCard(int k, int n) {
        kind = k;
        num = n;
    }

    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1, 1);
    }

    /*
    정답 :
    -클래스 변수 (static 변수) :
    width,height
    -인스턴스 변수 :
    kind, num
    -지역 변수 :
    card, k, n args
     */
}
