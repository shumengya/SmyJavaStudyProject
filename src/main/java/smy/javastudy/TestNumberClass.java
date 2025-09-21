package smy.javastudy;
import java.lang.Number;

public class TestNumberClass {

    //基本类型转换
    public void typeConversion(){
        Number num1 = 1234.56;
        System.out.println(num1);
        System.out.println(num1.getClass());
        System.out.println(num1.intValue());
        System.out.println(num1.longValue());
        System.out.println(num1.doubleValue());
        System.out.println(num1.floatValue());
        System.out.println(num1.byteValue());
    }

    //数值比较
    public void compareNum(){
        Integer x = 10;
        Double y = 10.0;
        System.out.println(x.doubleValue()==y.doubleValue());
    }

    //处理大数
    //public
}
