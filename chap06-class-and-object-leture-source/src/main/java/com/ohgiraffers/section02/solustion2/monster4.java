package com.ohgiraffers.section02.solustion2;

public class monster4 {
    /*
    * 접근제한자
    * 클래스 혹은 클래스의 멤버에게 참조연산자로 접근할수있는 범위를 제한하기위한 키워드
    * 2.public:모든 패키지에 접근허용
    * 2.protected:동일 패키지,상속관계인 다른패키지에 접근허용
    * 2.default: 동일 패키지에서만 접근 허용
    * 2.private:해당 클래스 내에서만 접근허용
    *
    * 위의 네가지 접근 제한자는 클래스의 멤버(필드,메소드)에 모두 사용가능하다
    * 단, 클래스 선ㅇ너시 사용하는 접근제한자는 퍼블릭과 디폴드만 가능*/

    private String kinds;
    private int hp;
    public void setkinds(String kinds){
        this.kinds=kinds;


    }
    public void sethp(int hp){
        if(hp>=0){
            this.hp=hp;
        }else {
            this.hp=0;
        }
    }
    public String getinfo(){
        return "name"+this.kinds+"hp"+this.hp;

    }

}
