package smy.javastudy.classes;

import smy.javastudy.aiwrite.MathUtils;

//数学类的简单举例
public class MathClass {

    public void MathClass() {
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
        System.out.println("10 的自然对数是: " + Math.log(10));//ln10
        System.out.println("100 的以10为底的对数是: " + Math.log10(100));//lg100
        System.out.println("1000 的以2为底的对数是: " + (Math.log(1000)/Math.log(2)));//以2为底的对数可以用换底公式计算
        System.out.println("10000 的以5为底的对数是: " + (MathUtils.log(10000,5)));//
        System.out.println("2^3 是: " + Math.pow(2, 3));
        System.out.println("16 的平方根是: " + Math.sqrt(16));

        // 三角函数
        double radians = Math.toRadians(angle);
        System.out.println(angle + " 度的正弦值是: " + Math.sin(radians));
        System.out.println(angle + " 度的余弦值是: " + Math.cos(radians));
        System.out.println(angle + " 度的正切值是: " + Math.tan(radians));
        System.out.println("将 " + radians + " 弧度转换为度: " + Math.toDegrees(radians));
        System.out.println("1的反正切值: " + Math.atan(1));//反正切值

        // 随机数生成
        // Math.random() 返回一个大于等于 0.0 且小于 1.0 的 double 值 [0,1)
        System.out.println("一个随机数: " + Math.random());
        // 获取一个范围内的随机整数，例如 [1, 10]
        int randomInt = (int) (Math.random() * 10) + 1;
        System.out.println("一个 1 到 10 之间的随机整数: " + randomInt);

        // 其他有用的方法
        System.out.println("符号函数:"+Math.signum(-23.45));//返回数字的符号，负数返回-1.0，正数返回1.0，零返回0.0 → -1.0
        System.out.println("平方和开根:"+Math.hypot(3,4));//计算sqrt(3²+5²) → 5.0
        System.out.println("返回余数"+Math.IEEEremainder(10,3));//返回10除以3的余数，结果可能为负数 → 1.0
        System.out.println("指数运算:"+Math.getExponent(256.0));//返回256的指数部分 → 8
        System.out.println("2的3次方:"+Math.scalb(2,3));//返回2乘以2的3次方 → 16.0
        System.out.println("转换成字符串: " + Math.random());//返回"java.lang.Math"
        System.out.println("字串符解析成整数数值:"+Integer.parseInt("123123123"));//返回123123123
        System.out.println("字串符解析成浮点数值:"+Double.parseDouble("123.123123"));//返回123.123123;
        System.out.println("=========================Math类的用法=========================\n");

    }

}
