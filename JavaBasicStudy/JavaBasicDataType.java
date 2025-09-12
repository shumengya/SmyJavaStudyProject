package JavaBasicStudy;

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
        System.out.println("整数类型 (int): " + integerType);
        System.out.println("单精度浮点类型 (float): " + floatType);
        System.out.println("双精度浮点类型 (double): " + doubleType);
        System.out.println("字符类型 (char): " + charType);
        System.out.println("布尔类型 (boolean): " + booleanType);
        System.out.println("字符串类型 (String): " + stringType);
        System.out.println("长整型 (long): " + longType);
        System.out.println("短整型 (short): " + shortType);
        System.out.println("字节型 (byte): " + byteType);
    }
}
