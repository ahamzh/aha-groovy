package com.halo.groovy.method

/**
 * Groovy方法
 * Groovy 中的方法是使用返回类型或使用 def 关键字定义的。
 * 方法可以接收任意数量的参数。
 * 定义参数时，不必显式定义类型。可以添加修饰符，如 public，private 和 protected。
 * 默认情况下，如果未提供可见性修饰符，则该方法为 public。
 */
class GroovyMethod {

    static void main(String[] args) {
        String name = methodB("张三");
        double age = methodB(11D) as double;
        println name;
        println age;
        println methodC(1);
        println methodC(1, 6);
    }

    /**
     * 没有入参，有返回值
     * @return
     */
    static def methodA() {
        return "methodA调用结果";
    }

    /**
     * 有入参，有返回值
     * @param param
     * @return
     */
    static def methodB(param) {
        return param;
    }

    /**
     * 有默认参数，有返回值
     */
    static int methodC(int a, b = 5) {
        return a + b;
    }
}
