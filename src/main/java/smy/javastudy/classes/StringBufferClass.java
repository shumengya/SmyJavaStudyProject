package smy.javastudy.classes;

public class StringBufferClass {

    public void StringBufferClass() {
        System.out.println("\n=====================StringBufferClass==========================");
        // 初始对象，后续操作不会修改此对象
        StringBuffer original = new StringBuffer("Hello World");
        System.out.println("初始字符串: " + original);

        // 1. 追加操作 - 基于原对象创建副本后操作
        StringBuffer appended = new StringBuffer(original); // 复制原对象
        appended.append(" appended text.");
        System.out.println("追加字符串: " + appended);

        // 2. 插入操作 - 基于原对象创建副本后操作
        StringBuffer inserted = new StringBuffer(original); // 复制原对象
        inserted.insert(0, "Start-");
        System.out.println("插入字符串: " + inserted);

        // 3. 替换操作 - 基于原对象创建副本后操作
        StringBuffer replaced = new StringBuffer(original); // 复制原对象
        replaced.replace(1, 3, "replaced");
        System.out.println("替换字符串: " + replaced);

        // 4. 反转操作 - 基于原对象创建副本后操作
        StringBuffer reversed = new StringBuffer(original); // 复制原对象
        reversed.reverse();
        System.out.println("反转字符串: " + reversed);

        // 5. 删除操作 - 基于原对象创建副本后操作
        StringBuffer deleted = new StringBuffer(original); // 复制原对象
        deleted.delete(0, deleted.length() - 1);
        System.out.println("删除字符串: " + deleted);

        // 6. 获取长度
        int length = original.length();
        System.out.println("原始字符串长度: " + length);

        //获取容量
        int capacity = original.capacity();
        System.out.println("原始字符串容量: " + capacity);

        System.out.println("=====================StringBufferClass==========================\n");



    }
}
