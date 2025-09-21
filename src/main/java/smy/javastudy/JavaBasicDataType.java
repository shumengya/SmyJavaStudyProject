package smy.javastudy;

public class JavaBasicDataType {
    public int integerType = 100; //整数类型
    public float floatType = 3.14f; //单精度浮点类型
    public double doubleType = 3.141592653589793; //双精度浮点类型
    public char charType = 'A'; //字符类型
    public boolean booleanType = true; //布尔类型
    public String stringType = "Hello, Java!"; //字符串类型
    public long longType = 123456789L; //长整型
    public short shortType = 32000; //短整型
    public byte byteType = 100; //字节型

    public void displayDataTypes() {
        System.out.println("==================================================");
        System.out.println("整数类型 (int): " + integerType);
        System.out.println("单精度浮点类型 (float): " + floatType);
        System.out.println("双精度浮点类型 (double): " + doubleType);
        System.out.println("字符类型 (char): " + charType);
        System.out.println("布尔类型 (boolean): " + booleanType);
        System.out.println("字符串类型 (String): " + stringType);
        System.out.println("长整型 (long): " + longType);
        System.out.println("短整型 (short): " + shortType);
        System.out.println("字节型 (byte): " + byteType);
        System.out.println("==================================================");
    }

    public void ShowDataTypesInfo() {
        System.out.println("==================================================");
        System.out.println("基本类型：byte 二进制位数："+Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE="+Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE="+Byte.MAX_VALUE);
        System.out.println();

        System.out.println("基本类型：short 二进制位数："+Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE="+Short.MIN_VALUE);
        System.out.println("最大值：Short.Max_Value="+Short.MAX_VALUE);
        System.out.println();

        System.out.println("基本类型：int 二进制位数："+Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE="+Integer.MIN_VALUE);
        System.out.println("最大值：Integer.Max_Value="+Integer.MAX_VALUE);
        System.out.println();

        System.out.println("基本类型：long 二进制位数："+Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE="+Long.MIN_VALUE);
        System.out.println("最大值：Long.Max_Value="+Long.MAX_VALUE);
        System.out.println();

        System.out.println("基本类型：float 二进制位数："+Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE="+Float.MIN_VALUE);
        System.out.println("最大值：Float.Max_Value="+Float.MAX_VALUE);
        System.out.println();

        System.out.println("基本类型：double 二进制位数："+Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE="+Double.MIN_VALUE);
        System.out.println("最大值：Double.Max_Value="+Double.MAX_VALUE);
        System.out.println();

        System.out.println("基本类型：char 二进制位数："+Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        System.out.println("最小值：Character.MIN_VALUE="+(int)Character.MIN_VALUE);
        System.out.println("最大值：Character.Max_Value="+(int)Character.MAX_VALUE);

        System.out.println("==================================================");

    }
}
