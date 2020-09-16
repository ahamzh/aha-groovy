package com.halo.groovy.variable

/**
 * Groovy变量
 * Groovy中的变量可以通过两种方式定义
 * - 使用数据类型的本地语法，或者使用def关键字。
 * 对于变量定义，必须明确提供类型名称或在替换中使用“def”。
 */
class GroovyVariable {
    static void main(String[] args) {
        String str = "这是一个字符串";
        int i = 11;
        def v = 11
        v = "张三";
        println str;
        println v;
        println v + str;
        println i;
    }
}
