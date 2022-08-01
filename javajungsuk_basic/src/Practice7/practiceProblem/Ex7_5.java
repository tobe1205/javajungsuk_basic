package Practice7.practiceProblem;
/*
연습문제 7-4에서 작성한 MyTv 클래스에 이전 채널(Previous channel) 로 이동하는 기능의 메서드를 추가해서
실행결과와 같은 결과를 얻도록 하시오.

HINT : 이전 채널의 값을 저장할 멤버변수를 정의하라.
 */

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    private int prevChannel; // 1. 이전 채널의 값을 저장할 변수 생성

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME || volume < MIN_VOLUME) {
            return;
        }
        this.volume = volume;
    }

    public void setChannel(int channel) {
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
            return;
        }
        prevChannel = this.channel;// 2. 현재 채널을 이전 채널에 저장
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    // 3. gotoPrevChannel()메서드 생성
    public void gotoPrevChannel() {
        setChannel(prevChannel); //현재 채널을 이전채널로 변경한다.
    }
}

public class Ex7_5 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(30);
        System.out.println("CH:" + t.getChannel());
        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());

        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());

    }
}
