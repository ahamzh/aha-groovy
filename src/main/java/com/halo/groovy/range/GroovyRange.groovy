package com.halo.groovy.range

/**
 * 范围是指定值序列的速记。范围由序列中的第一个和最后一个值表示，Range可以是包含或排除。
 * 包含范围包括从第一个到最后一个的所有值，而独占范围包括除最后一个之外的所有值。
 * 1..10 - 包含范围的示例
 * 1 .. <10 - 独占范围的示例
 * 'a'..'x' - 范围也可以由字符组成
 * 10..1 - 范围也可以按降序排列
 * 'x'..'a' - 范围也可以由字符组成并按降序排列。
 */
class GroovyRange {
    public static void main(String[] args) {
        IntRange a = 10..1;

        println(a.contains(1))
        println(a.contains(11))

        println(a.get(2))

        println(a.isReverse())

        println(a.getFrom())
        println(a.getTo())

        println(a.size())

        println(a.subList(0, 2))
    }
}
