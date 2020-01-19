package com.test.maven.goods.util;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface ExportSortAnnotation {

    int sort() default 1;
}
