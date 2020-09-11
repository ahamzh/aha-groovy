package com.aha.groovy.type

/**
 * groovy数据类型和包装器类型（跟java完全一致）
 * groovy数据类型基本类型也是对象
 *
 * byte -这是用来表示字节值。-128到127。
 * short -这是用来表示一个短整型。-32,768到32,767。
 * int -这是用来表示整数。2,147,483,648 到,147,483,647。
 * long -这是用来表示一个长整型。-9,223,372,036,854,775,808到+9,223,372,036,854,775,807。
 * float -这是用来表示32位浮点数。1.40129846432481707e-45到3.40282346638528860e + 38。
 * double -这是用来表示64位浮点数，这些数字是有时可能需要的更长的十进制数表示。4.94065645841246544e-324d 到1.79769313486231570e + 308d。
 * char -这定义了单个字符文字。例如“A”。
 * boolean -这表示一个布尔值，可以是true或false。
 * String -这些是以字符串的形式表示的文本。例如，“Hello World”的。
 */

class GroovyType {

    static void main(String[] args) {
        byte a = 1;
        short b = 1;
        int c = 1;
        long d = 1L;
        float e = 1F;
        double f = 1D;
        char g = 'a';
        boolean h = false;
    }

}