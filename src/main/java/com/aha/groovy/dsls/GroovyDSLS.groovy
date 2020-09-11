package com.aha.groovy.dsls

/**
 * Groovy允许在顶层语句的方法调用的参数周围省略括号。这被称为“命令链”功能。
 * 这个扩展的工作原理是允许一个人链接这种无括号的方法调用，在参数周围不需要括号，也不需要链接调用之间的点。
 *
 * 如果一个调用被执行为bcd，这将实际上等价于a（b）.c（d）。
 * DSL或域特定语言旨在简化以Groovy编写的代码，使得它对于普通用户变得容易理解。
 */
class GroovyDSLS {

    static class EmailDsl {
        String toText
        String fromText
        String body

        def static make(closure) {
            EmailDsl emailDsl = new EmailDsl()
            closure.delegate = emailDsl
            closure()
        }

        def to(String toText) {
            this.toText = toText
        }

        def from(String fromText) {
            this.fromText = fromText
        }

        def body(String bodyText) {
            this.body = bodyText
        }
    }

    public static void main(String[] args) {
        EmailDsl.make({
            to("Nirav Assar");
            from("Barack Obama");
            body("How are things? We are doing well. Take care");
        })
    }


}
