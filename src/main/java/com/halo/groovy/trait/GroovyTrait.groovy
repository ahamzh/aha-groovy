package com.halo.groovy.trait

/**
 * Groovy特征
 *
 * 特征是语言的结构构造，允许 -
 * 行为的组成。
 * 接口的运行时实现。
 * 与静态类型检查/编译的兼容性
 *
 * 它们可以被看作是承载默认实现和状态的接口。
 */
class GroovyTrait {

    trait Animal implements AnimalAction {
        int age;
        String name;

        public void eat() {
            println name + age + "正在吃";
        }
    }

    interface AnimalAction {
        void eat();

        void call();
    }

    static class Dog implements Animal {

        Dog(age, name) {
            this.age = age;
            this.name = name;
        }

        @Override
        void call() {
            println name + age + "汪汪汪";
        }
    }

    public static void main(String[] args) {
        new Dog(11, "旺财").call();
    }
}
