package com.halo.groovy.closure

/**
 * Groovy闭包
 *
 * 闭包是一个短的匿名代码块。
 * 它通常跨越几行代码。
 * 一个方法甚至可以将代码块作为参数。
 * 它们是匿名的。
 */
class GroovyClosure {
    public static void main(String[] args) {
        String tel = "110";

        //无参，无返回值
        def callTel = {
            println "正在拨打电话" + tel;
        }

        //有参，有返回值
        def callTel2 = {
            param ->
                {
                    println "正在拨打电话" + param;
                    return "电话正在接通中";
                }
        }

        callTel.call();
        callTel2.call("119");

        methodA({ para ->
            {
                println "传给methodA的参数";
            }
        })
        
    }

    static void methodA(method) {
        method.call("aaaa");
    }
}
