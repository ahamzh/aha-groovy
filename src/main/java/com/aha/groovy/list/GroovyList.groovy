package com.aha.groovy.list

/**
 * Groovy列表
 * groovy 中的一个列表中的数据可以是任意类型。这java下集合列表有些不同，java 下的列表是同种类型的数据集合。
 */
class GroovyList {
    public static void main(String[] args) {
        def list = [1, "a", 2, "b", [1, 2, 3, 4, 5], 3, "c"];
        list = list + 4;
        list = list.plus("d");
        println list

        println list[4][2]

        println list.minus("c")

        println list.push("e")

        println list.pop()
    }
}
