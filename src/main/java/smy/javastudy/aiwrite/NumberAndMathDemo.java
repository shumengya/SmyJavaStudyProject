package smy.javastudy.aiwrite;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberAndMathDemo {

    public void numberClassUsage() {
        System.out.println("=========================Number类的用法=========================");

        // Number 是一个抽象类，其子类包括 Integer、Double、Float 等。
        // 我们可以用它来持有任何数字类型。
        Number num1 = 123;
        Number num2 = 456.78;

        System.out.println("num1 是: " + num1 + "，类型是 " + num1.getClass().getName());
        System.out.println("num2 是: " + num2 + "，类型是 " + num2.getClass().getName());

        // xxxValue() 方法用于转换为基本数据类型
        System.out.println("num1 作为 int: " + num1.intValue());
        System.out.println("num1 作为 double: " + num1.doubleValue());
        System.out.println("num2 作为 int: " + num2.intValue()); // 注意：这会截断小数部分
        System.out.println("num2 作为 long: " + num2.longValue());
        System.out.println("num2 作为 float: " + num2.floatValue());
        System.out.println("num2 作为 byte: " + num2.byteValue());
        System.out.println("num2 作为 short: " + num2.shortValue());

        // compareTo() 方法 (来自 Comparable 接口, 由 Number 的子类实现)
        Integer int1 = 100;
        Integer int2 = 200;
        System.out.println("比较 100 和 200: " + int1.compareTo(int2)); // 如果小于则为-1，如果等于则为0，如果大于则为1

        // equals() 方法
        Double double1 = 123.45;
        Double double2 = 123.45;
        System.out.println("用 equals() 比较 123.45 和 123.45: " + double1.equals(double2));

        // 使用 BigInteger 和 BigDecimal 处理非常大的数字
        BigInteger bigInt = new BigInteger("12345678901234567890");
        BigDecimal bigDecimal = new BigDecimal("1234567890.0987654321");
        System.out.println("BigInteger: " + bigInt);
        System.out.println("BigDecimal: " + bigDecimal);

        // 大数的算术运算
        BigInteger bigIntSum = bigInt.add(new BigInteger("1"));
        System.out.println("BigInteger 的和: " + bigIntSum);
        BigDecimal bigDecimalProduct = bigDecimal.multiply(new BigDecimal("2.5"));
        System.out.println("BigDecimal 的积: " + bigDecimalProduct);
        System.out.println("=========================Number类的用法=========================");
    }

    public void mathClassUsage() {
        System.out.println("\n=========================Math类的用法=========================");

        double x = 45.6;
        double y = -78.9;
        double angle = 45.0;

        // 基本算术方法
        System.out.println(y + " 的绝对值是: " + Math.abs(y));
        System.out.println(x + " 的向上取整是: " + Math.ceil(x)); // 向上取整
        System.out.println(x + " 的向下取整是: " + Math.floor(x)); // 向下取整
        System.out.println(x + " 的四舍五入是: " + Math.round(x)); // 四舍五入到最近的整数
        System.out.println(x + " 和 " + y + " 的最大值是: " + Math.max(x, y));
        System.out.println(x + " 和 " + y + " 的最小值是: " + Math.min(x, y));

        // 指数和对数函数
        System.out.println("e^2 是: " + Math.exp(2));
        System.out.println("10 的自然对数是: " + Math.log(10));
        System.out.println("100 的以10为底的对数是: " + Math.log10(100));
        System.out.println("2^3 是: " + Math.pow(2, 3));
        System.out.println("16 的平方根是: " + Math.sqrt(16));

        // 三角函数
        double radians = Math.toRadians(angle);
        System.out.println(angle + " 度的正弦值是: " + Math.sin(radians));
        System.out.println(angle + " 度的余弦值是: " + Math.cos(radians));
        System.out.println(angle + " 度的正切值是: " + Math.tan(radians));
        System.out.println("将 " + radians + " 弧度转换为度: " + Math.toDegrees(radians));

        // 随机数生成
        // Math.random() 返回一个大于等于 0.0 且小于 1.0 的 double 值
        System.out.println("一个随机数: " + Math.random());
        // 获取一个范围内的随机整数，例如 [1, 10]
        int randomInt = (int) (Math.random() * 10) + 1;
        System.out.println("一个 1 到 10 之间的随机整数: " + randomInt);
        System.out.println("\n=========================Math类的用法=========================\n");
    }
}
