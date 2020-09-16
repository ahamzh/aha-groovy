package com.halo.groovy.number

/**
 * Groovy 数字
 * 在Groovy中，数字实际上表示为对象，它们都是类Integer的一个实例。要使对象做某事，我们需要调用在其类中声明的一个方法。
 * Groovy支持整数和浮点数。
 * 整数是不包含分数的值。
 * 浮点数是包含小数部分的十进制值。
 */
class GroovyNumber {
    static void main(String[] args) {
        double a = -1.1111;
        //由于Groovy中的Numbers表示为类，以下是可用的方法列表。
        println a.byteValue();
        println a.doubleValue();
        println a.floatValue();
        println a.intValue();
        println a.longValue();
        println a.shortValue();

        println a.compareTo(3)

        //绝对值
        println a.abs();

    }
}
