package com.ider.GameTwo;

public class LinShou {
    //每只灵兽都有自己的名字、属性、能力值、等级、独有技能
    String sname;//名字
    String sx;//属性
    String  nlz;//能力值
    String dj;//等级
    String jn;//独有技能
    String lx;//类型
    String ji;//金木水火土
public LinShou(){}

public LinShou(String lx,String ji,String sname,String sx,String jn){

    this.lx=lx;
    this.ji=ji;
    this.sname=sname;
    this.sx=sx;
    this.jn=jn;

}

    public static void main(String[] args) {
        LinShou l=new LinShou("类型","金","姓名：鼠宝","\t属性：陆地宝宝","\t技能：减少主人技能冷却时间");

        System.out.println(l.lx);
        System.out.println(l.sname);
        System.out.println(l.sx);
        System.out.println(l.jn);
    }
}
