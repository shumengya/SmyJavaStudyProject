package smy.javastudy;



public class Main {
    final double PI = 3.14159;
    int decimal = 100;
    int octal = 0144;
    int hexa = 0x64;

    //项目唯一主函数
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
        System.out.printf("Hello and welcome!\n");
        Main main = new Main();
        main.testHuHangTao();

        JavaBasicDataType dataType = new JavaBasicDataType();
        dataType.ShowDataTypesInfo();

        GrammarPractice grammarPractice = new GrammarPractice();
        grammarPractice.Exchange("刘道熙");
        grammarPractice.Exchange("唐伟");
        grammarPractice.Exchange("树萌芽");

        NumberAndMathDemo demo = new NumberAndMathDemo();
        demo.numberClassUsage();
        demo.mathClassUsage();
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