package com.halo.groovy.string

/**
 * Groovy字符串
 * 通过在引号中包含字符串文本，在Groovy中构造一个字符串文字。
 * Groovy提供了多种表示String字面量的方法。
 * Groovy中的字符串可以用单引号（'），双引号（“）或三引号（”“”）括起来。
 * 此外，由三重引号括起来的Groovy字符串可以跨越多行。
 */
class GroovyString {
    public static void main(String[] args) {
        //三重引号跨越多行
        String s = """kkkkka
sdaasd
asdas""";
        println s;

        //字符串索引:Groovy中的字符串是字符的有序序列。字符串中的单个字符可以通过其位置访问。这由索引位置给出。
        //字符串索引从零开始，以小于字符串长度的一个结束。 Groovy还允许负索引从字符串的末尾开始计数。
        String str = "abcdefg";
        println str[0]
        println str[-1]
    }
}
