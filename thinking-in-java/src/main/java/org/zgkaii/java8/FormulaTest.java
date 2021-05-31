package org.zgkaii.java8;

/**
 * @Author: Mr.Z
 * @DateTime: 2021/05/28 10:55
 * @Description:
 **/
public class FormulaTest {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        System.out.println(formula.calculate(100)); // 100.0
        System.out.println(formula.sqrt(25)); // 5.0
    }
}
