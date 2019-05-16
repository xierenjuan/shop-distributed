package com.test.common.util;

import java.lang.annotation.*;

/**
 * 是否需要记录操作日志的controller方法
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface LogRecord {

    String id() default "";
}
