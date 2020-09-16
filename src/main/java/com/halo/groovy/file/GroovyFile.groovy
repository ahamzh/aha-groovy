package com.halo.groovy.file

/**
 * Groovy文件I/O
 * Groovy在使用I / O时提供了许多辅助方法，Groovy提供了更简单的类来为文件提供以下功能。
 * 读取文件
 * 写入文件
 * 遍历文件树
 * 读取和写入数据对象到文件
 */
class GroovyFile {

    static void main(String[] args) {
//        writeFile("测试");
        copyFile("./gFile1.text","./gFile2.text")
    }

    /**
     * 读取每一行
     * @param filePath
     */
    public static void readFileLine(String filePath) {

        //方式一
        List<String> readLines = new File(filePath).readLines("utf-8");
        println readLines

        //方式二
        new File(filePath).eachLine { line ->
            {
                println "line : $line";
            }
        }

    }

    /**
     * 读取作为字符串
     * @param filePath
     */
    public static void readFileAsStr(filePath) {
        println new File(filePath).text;
    }

    /**
     * 写入文件
     * @param content
     */
    public static void writeFile(String content) {
        //方式一
        new File("./gFile1.text").write(content);
        //方式二
        new File("./gFIle2.text").withWriter("utf-8", {
            writer -> writer.writeLine 'Hello World';
        })
    }

    /**
     * 获取文件大小
     * @param filePath
     */
    public static void getFileSize(filePath) {
        println new File(filePath).length();
    }

    /**
     * 是否目录，是否文件
     * @param filePath
     */
    public static void isDir(filePath) {
        println new File(filePath).isDirectory();
        println new File(filePath).isFile();
    }

    /**
     * 创建目录
     * @param dirPath
     */
    public static void mkdir(dirPath) {
        println new File(dirPath).mkdir();
    }

    /**
     * 删除文件
     * @param filePath
     */
    public static void delFile(filePath) {
        println new File(filePath).delete();
    }

    /**
     * 复制文件
     * @param filepath1
     * @param filepath2
     */
    public static void copyFile(filepath1, filepath2) {
        new File(filepath1) << new File(filepath2).text
    }
}
