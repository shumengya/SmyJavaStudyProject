package JavaBasicStudy;

public class HelloJava {
    enum Color {
        RED,ORANGE,YELLOW,GREEN,BLUE,BLACK,WHITE    
    }

    public static void main(String[] args) {
        HelloJava helloJava = new HelloJava();
        helloJava.testHuHangTao();
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


