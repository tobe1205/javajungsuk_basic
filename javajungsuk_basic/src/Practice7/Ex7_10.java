package Practice7;

public class Ex7_10 {
    public static void main(String[] args) {

        Unit[] group = {new Tank(), new Marine(), new Dropship()};

        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200);
        }
    }
}

abstract class Unit {
    int x, y; //좌표
    abstract void move(int x, int y);
    void stop() {}//현재 위치에 정지
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + ",y=" + y + "]");
    }
    void stimPack() {}
}

class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank[x=" + x + ",y=" + y + "]");
    }
    void changeMode() {}
}

class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship[x=" + x + ",y=" + y + "]");
    }
    void load() {}
    void unload() {}
}

