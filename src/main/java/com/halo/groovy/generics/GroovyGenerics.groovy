package com.halo.groovy.generics

/**
 * Groovy泛型(跟java一致)
 */
class GroovyGenerics {

    static class Demo<T> {

        T param;

        Demo(T param) {
            this.param = param
        }
    }

    public static void main(String[] args) {
        def demo = new Demo<int>(1);
        println demo.param
    }
}
