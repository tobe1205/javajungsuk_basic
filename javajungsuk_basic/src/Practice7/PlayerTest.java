package Practice7;

abstract class Player { //추상클래스
    abstract void play(int pos); //추상메서드
    abstract void stop(); //추상 메서드(선언부만 있고, 구현부 x)
}

//추상 클래스는 상속을 통해 완성해야 객체 생성 가능
class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos + "위치부터 play합니다.");
    }

    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
}

public class PlayerTest {
    public static void main(String[] args) {
//        Player p = new Player();
        AudioPlayer ap = new AudioPlayer();
        //Player ap = new AudioPlayer(); 다형성으로 호출 가능
        ap.play(100);
        ap.stop();
    }
}
