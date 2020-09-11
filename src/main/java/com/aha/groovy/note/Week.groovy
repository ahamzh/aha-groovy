package com.aha.groovy.note

import java.lang.annotation.*

@Target([ElementType.FIELD, ElementType.TYPE])
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@interface Week {
    String dayOfWeek() default "monday";
}