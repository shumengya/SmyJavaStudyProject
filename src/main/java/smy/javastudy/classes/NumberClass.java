package smy.javastudy.classes;
import java.lang.Number;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;

public class NumberClass {

    //基本类型转换
    public void NumberClass(){
        System.out.println("\n=========================Number类的用法=========================");
        Number num1 = 1234.56;
        System.out.println(num1);
        System.out.println(num1.getClass());
        System.out.println(num1.intValue());
        System.out.println(num1.longValue());
        System.out.println(num1.doubleValue());
        System.out.println(num1.floatValue());
        System.out.println(num1.byteValue());


        //数值比较
        Integer x = 10;
        Double y = 10.0;
        System.out.println(x.doubleValue()==y.doubleValue());

        //大数用法
        BigInteger bigInt1 = new BigInteger("123122222222222222222222231231231231231");
        BigInteger bigInt2 = new BigInteger("9876543210987654321098765432109876543210");
        BigInteger resInt1 = bigInt1.add(bigInt2); //相加 注意：BigInteger 和 BigDecimal 的加减乘除不能用 + - * / 这些运算符
        BigInteger resInt2 = bigInt1.multiply(bigInt2);//相乘
        BigInteger resInt3 = bigInt1.subtract(bigInt2);//相减
        BigInteger resInt4 = bigInt1.divide(bigInt2);//相除
        System.out.println("大整数相加"+resInt1);
        System.out.println("大整数相乘"+resInt2);
        System.out.println("大整数想减"+resInt3);
        System.out.println("大整数相除"+resInt4);

        BigDecimal bigDec1 = new BigDecimal("1293123.123123123123123123123");
        BigDecimal bigDec2 = new BigDecimal("98765.4321098765432109876543210");
        BigDecimal resDec1 = bigDec1.add(bigDec2);
        BigDecimal resDec2 = bigDec1.multiply(bigDec2);
        BigDecimal resDec3 = bigDec1.subtract(bigDec2);
        BigDecimal resDec4 = bigDec1.divide(bigDec2, 10, BigDecimal.ROUND_HALF_UP); // 指定小数位数和舍入模式，避免异常
        System.out.println("大浮点数相加"+resDec1);
        System.out.println("大浮点数相乘"+resDec2);
        System.out.println("大浮点数相减"+resDec3);
        System.out.println("大浮点数相除"+resDec4);

        // compareTo() 方法 (来自 Comparable 接口, 由 Number 的子类实现)
        Integer int1 = 100;
        Integer int2 = 200;
        System.out.println("比较 100 和 200: " + int1.compareTo(int2)); // 如果小于则为-1，如果等于则为0，如果大于则为1

        // equals() 方法
        Double double1 = 123.45;
        Double double2 = 123.45;
        System.out.println("用 equals() 比较 123.45 和 123.45: " + double1.equals(double2));

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(3); // 设置小数点后最多3位
        System.out.println("格式化后:"+nf.format(131321311.1231312));
        System.out.println("=========================Number类的用法=========================");
    }
}
