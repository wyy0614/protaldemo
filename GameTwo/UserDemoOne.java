package com.ider.GameTwo;
import java.util.Scanner;
public class UserDemoOne {
    //记录各自的姓名、门派、性别、年龄
    //年龄小于10岁或者大于30岁之人，不允许进入灵境
    //同一门派进入灵境人数不得超过10人
    //灵兽类型分为金、木、水、火、土五行属性
    //每只灵兽都有自己的名字、属性、能力值、等级、独有技能
    //能力值从0~10分为三个档次，一般0~3，中等4~6，优秀5~9，极品10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Users[] uarr = new Users[10];

        LinShou[] linShous = new LinShou[5];

        LinShou l = new LinShou("类型","金", "姓名：零栀", "\t属性：陆地宝宝", "\t\t技能：减少主人技能冷却时间");
        linShous[0] = l;

        LinShou l2 = new LinShou("类型", "木","姓名：噬骨", "\t属性：飞天宝宝", "\t\t技能：增加主人移动速度");
        linShous[1] = l2;

        LinShou l3 = new LinShou("类型","水", "姓名：凝安", "\t属性：两栖宝宝", "\t\t技能：降低敌人移动速度");
        linShous[2] = l3;

        LinShou l4 = new LinShou("类型","火", "姓名：时风", "\t属性：陆地宝宝", "\t\t技能：对敌人产生眩晕效果");
        linShous[3] = l4;

        LinShou l5 = new LinShou("类型","土","姓名：鬼魅", "\t属性：飞天宝宝", "\t\t技能：对敌人产生混乱效果");
        linShous[4] = l5;


        System.out.println("欢迎来到灵境入口，年龄小于10岁或者大于30岁之人，不允许进入灵境");
        System.out.println("现在，请输入你的用户名，门派，性别及年龄");
        String uname = sc.next();
        String mp = sc.next();
        String sex = sc.next();
        int age = sc.nextInt();


//用户登陆
        int m = login(uname, mp, sex, age, uarr);
        if (m == 1) {
            System.out.println("欢迎进入灵境");
            System.out.println("灵境之内禁止厮杀，一旦被界灵发现，将会直接抹除你的全部信息");
        } else {
            System.out.println("进入失败，请重新输入你的用户名，门派，性别及年龄");
            return;
        }
//灵兽信息
        System.out.println("灵兽类型为金、木、水、火、土，请输入你要选择的灵兽类型");
        String sx = sc.next();
        String linShou=chose(sx,linShous);
        System.out.println("你选择的灵兽信息为："+linShou);
//回答问题
        System.out.println("我可是个傲娇的宝宝，想要成为我的主人，就要接受我的考验，你准备好了吗？");
        System.out.println("请听题");
        System.out.println("你会不会时不时带我去逛吃逛吃？会请输入1，不会请输入0.");
        int z=sc.nextInt();
        if(z==1){
            System.out.println("灵兽：主人你最好了！");
            System.out.println("灵兽领取成功！");
            System.out.print("你选择灵兽的能力值为：");
        double q=Math.random()*10;
        long a=Math.round(q);
        System.out.println(a);
        if(a>0&&a<4){
            System.out.println("你的灵兽的等级为一般");
        }else if(a>3&&a<7){
            System.out.println("你的灵兽的等级为中等");
        }else if(a>6&&a<10){
            System.out.println("你的灵兽的等级为优秀");
        }else {
            System.out.println("你的灵兽的等级为极品");
        }

        }else {
            System.out.println("灵兽：哼，我才不要这样的主人");
            System.out.println("灵兽领取失败！");
            return;
        }
        System.out.println("你已领取灵兽成功，即将离开灵境");




    }


    public static int login(String uname, String mp, String sex, int age, Users[] uarr) {
        Users u = new Users();
        u.uname = uname;
        u.mp = mp;
        u.sex = sex;
        u.age = age;
        for (int i = 0; i < uarr.length; i++) {
            if (age > 10 && age < 30) {
                if (uarr[i] == null) {
                    uarr[i] = u;
                    return 1;
                }
            }
//            else {
//                System.out.println("不允许登陆");
//            }
        }
        return -1;
    }
//
    public static String chose(String sx, LinShou[] l) {
        String linShou="";
        for(int i=0;i<l.length;i++){
            if(l[i]!=null){
                if(l[i].lx.equals("类型")){
                    if(l[i].ji.equals(sx))
                    linShou=linShou+l[i].sname+l[i].sx+l[i].jn;
                }
            }
        }
       return linShou;
    }














}
