package smy.javastudy.classes;

public class CharacterClass {
    public void CharacterClass() {
        System.out.println("\n=========================Character类的用法=========================");
        char ch1 = 'a';
        char ch2 = '1';
        char ch3 = ' ';
        char ch4 = '\n';
        char ch5 = '中';

        // 判断字符类型
        System.out.println(ch1 + " 是字母吗? " + Character.isLetter(ch1));
        System.out.println(ch2 + " 是数字吗? " + Character.isDigit(ch2));
        System.out.println(ch3 + " 是空白吗? " + Character.isWhitespace(ch3));
        System.out.println(ch4 + " 是空白吗? " + Character.isWhitespace(ch4));
        System.out.println(ch5 + " 是汉字吗? " + Character.isIdeographic(ch5));

        // 字符转换
        System.out.println(ch1 + " 转为大写: " + Character.toUpperCase(ch1));
        System.out.println(Character.toUpperCase('A') + " 转为小写: " + Character.toLowerCase('A'));
        System.out.println("9 转为数字: " + Character.getNumericValue('9'));
        System.out.println("A 转为数字: " + Character.getNumericValue('A')); // A对应10

        // 获取字符信息
        System.out.println("Unicode 码点 of '" + ch5 + "': " + (int) ch5);
        System.out.println("字符 '" + ch1 + "' 的类别: " + Character.getType(ch1)); // 0-控制字符，1-大写字母，2-小写字母，9-数字等

        // 判断字符是否为特定类型
        System.out.println('A' + " 是大写字母吗? " + Character.isUpperCase('A'));
        System.out.println('a' + " 是小写字母吗? " + Character.isLowerCase('a'));

        // 其他有用的方法
        System.out.println("空字符 '\\0' 的 Unicode 码点: " + (int) '\0');
        System.out.println("回车符 '\\r' 的 Unicode 码点: " + (int) '\r');
        System.out.println("制表符 '\\t' 的 Unicode 码点: " + (int) '\t');

        //测试转义字符
        System.out.println("/t 效果为: Hello\tWorld!");//制表符
        System.out.println("/n 效果为: Hello\nWorld!");//换行符
        System.out.println("/r 效果为: Hello\rWorld!");//回车符
        System.out.println("/' 效果为: It\'s a nice day!");//单引号
        System.out.println("/" + " 效果为: He said, \"" + "Hello!\"");//双引号
        System.out.println("/ 效果为: This is a backslash: \\");//反斜杠
        System.out.println("访问\"菜鸟教程!\"");
        System.out.println("=========================Character类的用法=========================\n");
    }
}
