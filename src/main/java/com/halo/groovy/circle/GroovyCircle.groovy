package com.halo.groovy.circle

/**
 * Groovy循环
 * while
 * for
 * for-in
 * 循环控制语句
 * break
 * continue
 */
class GroovyCircle {
    public static void main(String[] args) {
        int[] arr = [1, 2, 3, 4, 5, 6, 7];
        int index = 0;
        //while
        while (index < arr.length) {
            if (index == 3) {
                index++;
                continue;
            }
            if (index == 6) {
                break;
            }
            println arr[index];
            index++;
        }
        //fori
        for (int i = 0; i < arr.length; i++) {
            println arr[i];
        }
        //for-in
        for (int x in arr) {
            println x;
        }
        for (int x : arr) {
            println x;
        }
    }
}
