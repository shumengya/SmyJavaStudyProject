package smy.javastudy;


import smy.javastudy.aiwrite.NumberAndMathDemo;
import smy.javastudy.classes.*;

public class Main {
    final double PI = 3.14159;
    int decimal = 100;
    int octal = 0144;
    int hexa = 0x64;

    //项目唯一主函数
    public static void main(String[] args) {
        //测试本地方法
        if(false){
            System.out.printf("Hello and welcome!\n");
            Main main = new Main();
            main.testHuHangTao();
        }


        //测试基本数据类型
        if(false){
            JavaBasicDataType dataType = new JavaBasicDataType();
            dataType.ShowDataTypesInfo();
        }


        //测试基本语法
        if(false){
            GrammarPractice grammarPractice = new GrammarPractice();
            grammarPractice.Exchange("刘道熙");
            grammarPractice.Exchange("唐伟");
            grammarPractice.Exchange("树萌芽");

        }


        //ai写的Number类和Math类的用法
        if(false){
            NumberAndMathDemo demo = new NumberAndMathDemo();
            demo.numberClassUsage();
            demo.mathClassUsage();
        }

        //测试Number类和Math类用法
        if (false){
            MathClass mathClass = new MathClass();
            mathClass.MathClass();
            NumberClass numberClass = new NumberClass();
            numberClass.NumberClass();
        }

        //测试Charactor类用法
        if(false){
            CharacterClass characterClass = new CharacterClass();
            characterClass.CharacterClass();
        }

        //测试String类用法
        if(false){
            StringClass stringClass = new StringClass();
            stringClass.StringClass();
        }

        //测试StringBuffer
        if (true){
            StringBufferClass stringBufferClass = new StringBufferClass();
            stringBufferClass.StringBufferClass();
        }

    }

    public void testHuHangTao(){
        SWPUStudent HuHangTao = new SWPUStudent("胡航滔", 20, "2024520541", "网络工程", 3.8, "hht@stu.swpu.edu.cn", "12345678901", "四川省广安市", "男");
        HuHangTao.ShowInfo();

        HuHangTao.setGpa(4.5);
        HuHangTao.setEmail(HuHangTao.getStudentID() + "@stu.swpu.edu.cn");
        HuHangTao.setPhoneNumber("18782345678");
        HuHangTao.ShowInfo();


    }
}