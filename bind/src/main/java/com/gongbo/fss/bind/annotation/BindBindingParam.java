package com.gongbo.fss.bind.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by $USER_NAME on 2019/1/18.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Repeatable(BindBindingParams.class)
public @interface BindBindingParam {
    String key();

    int id() default -1;
}
