package kr.hs.study.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseBall implements Sports{
    @Override
    public int getPlayer() {
        return player;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void rule() {
        System.out.println("경기 규칙은 해당 클래스에서 작성한다.");
    }
    public static void main(String args[]){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Sports obj1 = ctx.getBean("t1", BaseBall.class);
        Sports obj2 = ctx.getBean("t2", BaseBall.class);
    }
}

/*public Sports(String name, int player){
        this.player = player;
        this.name = name;
    }
    public int getPlayer(){
        return player;
    }
    public String getName(){
        return namer;
    }
    public rule(){
        System.out.println("경기 규칙은 해당 클래스에서 작성한다.");
    }*/