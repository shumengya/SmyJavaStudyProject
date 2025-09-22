package smy.javastudy.aiwrite;

public class MathUtils {

    // 使用泛型方法，支持所有Number子类（Integer, Long, Float, Double等）
    public static <T extends Number, U extends Number> double log(T base, U value) {
        // 将泛型参数转换为double进行计算
        double baseDouble = base.doubleValue();
        double valueDouble = value.doubleValue();

        // 参数校验
        if (baseDouble <= 0 || baseDouble == 1) {
            throw new IllegalArgumentException("底数必须是正数且不等于1");
        }
        if (valueDouble <= 0) {
            throw new IllegalArgumentException("对数值必须是正数");
        }

        // 计算并返回结果
        return Math.log(valueDouble) / Math.log(baseDouble);
    }

}

