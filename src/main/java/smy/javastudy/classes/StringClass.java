package smy.javastudy.classes;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringClass {

    //注意:String 类是不可改变的，所以你一旦创建了 String 对象，那它的值就无法改变了（详看笔记部分解析）。
    //如果需要对字符串做很多修改，那么应该选择使用 StringBuffer & StringBuilder 类。

    public void StringClass() {
        System.out.println("\n=========================String类的用法=========================");

        // 1. 创建与不可变性（immutable）
        String str = "Hello, World!"; // 字面量（驻留在字符串池）
        // 显式创建一个在堆上的新字符串对象（与字面量不同的引用），用于演示引用相等 vs 值相等
        String newObj = new StringBuilder(str).toString(); // 新对象（堆），用于演示引用不相等
        System.out.println("str == newObj ? " + (str == newObj) + "  // intentional: compare references"); // false（引用不同）
        System.out.println("str.equals(newObj) ? " + str.equals(newObj)); // true（内容相同）

        // 2. 基本常用方法
        System.out.println("字符串: " + str);
        System.out.println("长度: " + str.length());
        System.out.println("索引7的字符: " + str.charAt(7));// 索引从0开始 输出w 空格也算
        System.out.println("子串(7,12): " + str.substring(7, 12)); // 包含7，不包含12
        System.out.println("连接: " + str.concat(" Let's learn Java."));
        System.out.println("是否包含 'World' : " + str.contains("World"));
        System.out.println("第一次出现 'o' 的索引: " + str.indexOf('o')); // 找不到返回 -1
        System.out.println("最后出现 'o' 的索引: " + str.lastIndexOf('o'));
        System.out.println("替换 (World->Java): " + str.replace("World", "Java"));
        System.out.println("大写: " + str.toUpperCase(Locale.ENGLISH));
        System.out.println("小写: " + str.toLowerCase(Locale.ENGLISH));


        // 3. 去空白与比较
        String padded = "  Leading and trailing spaces  ";
        System.out.println("原始: '" + padded + "'");
        System.out.println("trim() -> '" + padded.trim() + "'"); // Java 8 起可用
        // Java 11+: strip(), isBlank(), repeat() 等更强大，若使用低版本请注释
        System.out.println("strip() -> '" + padded.strip() + "'");

        String s1 = "Hello";
        String s2 = "hello";
        System.out.println("equals 忽略大小写: " + s1.equalsIgnoreCase(s2));
        System.out.println("compareTo (字典序): " + s1.compareTo(s2)); // 区分大小写

        // 4. split / join / format
        String str2 = "Java Programming";
        System.out.println("分割字符串（空格）:");
        String[] parts = str2.split(" ");
        System.out.println(Arrays.toString(parts));
        System.out.println("join 示例: " + String.join(" | ", parts));

        int number = 42;
        double pi = 3.14159;
        String formatted = String.format("Number: %d, Pi: %.2f", number, pi);
        System.out.println("格式化: " + formatted);

        // 5. 正则与 replaceAll / matches
        String mixed = "abc123xyz456";
        System.out.println("matches digits only? " + "12345".matches("\\d+")); // true
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(mixed);
        System.out.print("正则查找数字: ");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();
        System.out.println("regex replace (digits->#): " + mixed.replaceAll("\\d", "#"));

        // 6. split 的 limit 使用与注意事项
        String csv = "a,b,c,d";
        System.out.println("split limit=2: " + Arrays.toString(csv.split(",", 2))); // [a, b,c,d]
        System.out.println("split limit=0 (默认): " + Arrays.toString(csv.split(",")));

        // 7. 性能提示：大量拼接用 StringBuilder
        StringBuilder sb = new StringBuilder(64);
        for (int i = 0; i < 5; i++) {
            sb.append(i).append('-');
        }
        String built = sb.toString();
        System.out.println("使用 StringBuilder 拼接: " + built);

        // 8. 字符编码与字节转换（注意编码）
        String chinese = "你好，世界";
        byte[] utf8 = chinese.getBytes(StandardCharsets.UTF_8);
        String fromUtf8 = new String(utf8, StandardCharsets.UTF_8);
        System.out.println("原始: " + chinese + " | bytes length(UTF-8): " + utf8.length + " | 还原: " + fromUtf8);

        // 9. 与基本类型互转
        String intStr = "123";
        int parsed = Integer.parseInt(intStr);
        System.out.println("解析数字: " + parsed + " (类型 int)");
        // 演示把基本类型变成字符串的常见方式：Integer.toString 或 String.valueOf
        System.out.println("Integer.toString(parsed) -> " + Integer.toString(parsed));

        // 10. 小心常见错误与边界
        // substring 越界会抛出 IndexOutOfBoundsException
        // indexOf 返回 -1 要先判断再用
        String maybe = "abc";
        int idx = maybe.indexOf('x');
        System.out.println("indexOf 'x' -> " + idx + " (如果 -1 就表示没找到)");

        // 11. 文本块（text block）示例（Java 13+），若你的 JDK 版本低，请注释掉下面部分
        // String multiLine = """
        //         This is a multi-line
        //         string example.
        //         It preserves line breaks and spaces.
        //         """;
        // System.out.println("多行文本块示例: " + multiLine);

        System.out.println("=========================String类的用法=========================");
    }
}
