package com.twc.jlyi.线程;

/**
 *  如果一个类继承thread,则不适合资源共享，
 *  如果实现了Runnable接口的话，很容易实现资源共享。
 *
 *      多线程：1. 适合多个相同的程序代码的线程去共享同一个资源。
 * 2. 可以避免java中的单继承的局限性。
 * 3. 增加程序的健壮性，实现解耦操作，代码可以被多个线程共享，代码和线程独立。
 * 4. 线程池只能放入实现Runable或Callable类线程，不能直接放入继承Thread的类
 *
 */
public class Thread和runnable的区别 {
}
