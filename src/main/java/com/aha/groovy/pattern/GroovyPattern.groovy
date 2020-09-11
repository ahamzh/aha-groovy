package com.aha.groovy.pattern

/**
 * Groovy正则表达式
 * 正则表达式是用于在文本中查找子字符串的模式。
 * Groovy使用〜“regex”表达式本地支持正则表达式。引号中包含的文本表示用于比较的表达式。
 *
 * 当定义正则表达式时，可以使用以下特殊字符
 * 有两个特殊的位置字符用于表示一行的开始和结束：caret（∧）和美元符号（$）。
 * 正则表达式也可以包括量词。加号（+）表示一次或多次，应用于表达式的前一个元素。星号（*）用于表示零个或多个出现。问号（？）表示零或一次。
 * 元字符{和}用于匹配前一个字符的特定数量的实例。
 * 在正则表达式中，句点符号（。）可以表示任何字符。这被描述为通配符。
 * 正则表达式可以包括字符类。
 * 一组字符可以作为简单的字符序列，包含在元字符[和]中，如[aeiou]中。
 * 对于字母或数字范围，可以使用[a-z]或[a-mA-M]中的短划线分隔符。
 * 字符类的补码由方括号内的前导插入符号表示，如[∧a-z]中所示，并表示除指定的字符以外的所有字符。
 */
class GroovyPattern {
    public static void main(String[] args) {
        def regex = ~"Groovy";
        println regex.matcher("1111111").find();
        println regex.matcher("GroovyGroovy").find();
        println regex.matcher("Gro000ovy").find();
    }
}
