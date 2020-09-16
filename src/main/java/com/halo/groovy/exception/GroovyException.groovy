package com.halo.groovy.exception

/**
 * Groovy异常处理（跟Java一致）
 */
class GroovyException {

    static void main(String[] args) {
        try {
            methodA();
        } catch (e) {
            println "捕获了异常";
            e.printStackTrace();
        } finally {
            println "运行finally中的代码"
        }
    }

    static void methodA() {
        throw new RuntimeException("111111");
    }
    
}
