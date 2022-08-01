package Practice7.practiceProblem;
// My클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서
//접근할 수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
// getter와 setter 메서드를 추가하시오

//정답 : 인스턴스변수에 private 추가
class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;
//    boolean isPowerOn;
//    int channel;
//    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    //정답 : setter getter 메서드 추가
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
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }
}

public class Ex7_4 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("CH:" + t.getVolume());
    }
}
