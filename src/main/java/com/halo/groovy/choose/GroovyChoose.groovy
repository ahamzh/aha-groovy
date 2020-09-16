package com.halo.groovy.choose

/**
 * Groovy可选
 * Groovy是一个“可选”类型的语言，当理解语言的基本原理时，这种区别是一个重要的语言。
 * 与Java相比，Java是一种“强”类型的语言，由此编译器知道每个变量的所有类型，并且可以在编译时理解和尊重合同。这意味着方法调用能够在编译时确定。
 * 当在Groovy中编写代码时，开发人员可以灵活地提供类型或不是类型。这可以提供一些简单的实现，并且当正确利用时，可以以强大和动态的方式为您的应用程序提供服务。
 * 在Groovy中，可选的键入是通过'def'关键字完成的。
 */
class GroovyChoose {
    public static void main(String[] args) {
        def a = 100;
        println(a);

        def b = 100.10;
        println(b);

        def c = 100.101;
        println(c);

        def d = "HelloWorld";
        println(d);
    }
}
