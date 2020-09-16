package com.halo.groovy.map

/**
 * Groovy映射
 * 映射（也称为关联数组，字典，表和散列）是对象引用的无序集合。
 * Map集合中的元素由键值访问。
 * Map中使用的键可以是任何类。当我们插入到Map集合中时，需要两个值：键和值。
 */
class GroovyMap {
    public static void main(String[] args) {
        def map = ["key1": "value1", "key2": "value2", 1: "zhangsan"]
        println map.get("key1")
        println map.get(1)
    }
}
