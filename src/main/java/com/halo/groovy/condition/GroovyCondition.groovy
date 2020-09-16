package com.halo.groovy.condition

/**
 * Groovy 条件语句
 * 条件声明需要程序指定一个或者多个条件进行判断，如果条件被确定为真，则要执行一个或多个语句；如果条件被确定为假，则要执行其他语句。
 */
class GroovyCondition {
    static void main(String[] args) {
        String str = "张三李四王五";
        if (str.contains("张三")) {
            println("包含张三")
        } else {
            println "不含张三";
        }
        char[] chs = str.chars;
        for (char ch in chs) {
            printCh(ch);
        }
    }

    static void printCh(char ch) {
        switch (ch) {
            case '张': {
                println("包含张");
                break;
            }
            case '三': {
                println("包含三");
                break;
            }
            default: {
                println("默认");
                break;
            }
        }
    }
}
