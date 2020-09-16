package com.halo.groovy.note
/**
 * Groovy注释
 *
 * 注释是元数据的形式，其中它们提供关于不是程序本身的一部分的程序的数据。注释对它们注释的代码的操作没有直接影响。
 * 注释主要用于以下原因 -
 * 编译器信息 -编译器可以使用注释来检测错误或抑制警告。
 * 编译时和部署时处理 -软件工具可以处理注释信息以生成代码，XML文件等。
 * 运行时处理 -一些注释可以在运行时检查。
 *
 * 在Groovy中，基本注释如下所示：
 * @interface - at符号字符（@）向编译器指示以下是注释。
 * 注释可以以没有主体的方法的形式和可选的默认值来定义成员。
 */

@Week(dayOfWeek = "friday")
class GroovyNote {

    static void main(String[] args) {
        def groovyNote = new GroovyNote();
        println groovyNote.getClass().getAnnotation(Week.class).dayOfWeek();
    }

}
