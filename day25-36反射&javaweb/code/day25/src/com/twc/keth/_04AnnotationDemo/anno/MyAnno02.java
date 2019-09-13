package com.twc.keth._04AnnotationDemo.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 *  自定义注解：可以添加注解属性
 *  注解属性的作用是：存储数据
 *  属性类型：
 *  1. 基本数据类型
 *  2.String 类型
 *  3.class类型
 *  4.枚举类型
 *  5. 注解类型
 *  6.以上类型的数组
 *
 *如果有注解属性的话，那么在使用这个注解的时候，一定要给属性赋值
 *
 *  注解属性的特殊的地方:
 *  * 1. 定义注解属性的时候，可以给属性通过default关键字指定默认值，有默认值的属性使用的时候可以不赋值
 *  * 2. 如果属性是数组类型，但是使用的时候数组中只有一个值，那么可以省略大括号
 *  * 3. 如果只有一个属性要被赋值，并且这个属性的名字叫做value，那么可以省略掉"属性名="
 *   target 元注解
 *   作用：指定注解能够使用的地方
 *   取值：
 *   ElementType.Type表示可以在类，接口等上面
 *   ElementType.CONStructor 可以用在接口上面
 *
 *
 */
@Target(value = {ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.FIELD})
public @interface MyAnno02 {



}
