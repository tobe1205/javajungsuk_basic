package Practice6.Practice6_7;

/* 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버중에 static을 붙여야 하는 것은
어떤 것들이고 그 이유는 무엇인가? (단, 모든 병사의 공격력과 방어력은 같아야 한다.)
 */
class Marine {
    int x = 0, y = 0; //Marine의 위치좌표(x,y)
    int hp = 60; //현재 체력
    //static int weapon, static armor
    int weapon = 6; //공격력
    int armor = 0; // 방어력

    //static void weaponUp, static void armorUp
    void weaponUp(){
        weapon++;
    }

    void armorUp(){
        armor++;
    }
    void move(int x, int y){
        this.x = x;
        this.y = y;
    }
}

/*
정답 :
인스턴스 변수인 weapon, armor에 static을 붙인다.
이유 - 모든 인스턴스에 대해 동일한 값이어야 하므로
인스턴스 메서드 weaponUp(), armorUp()
이유 - static변수에 대한 작업을 하는 메서드이므로

인스턴스 변수인 x, y 는 값이 변할 수 있기 때문에 붙이지 않고, move메서드 또한 인스턴스변수를
사용해야하므로 static을 붙이지 않는다.
 */
