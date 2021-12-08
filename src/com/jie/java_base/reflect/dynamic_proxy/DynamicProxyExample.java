package com.jie.java_base.reflect.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyExample {
    public static void main(String[] args) {
        generalCreateInterfaceInstance();
        dynamicProxyCreateInstance();
    }

    private static void generalCreateInterfaceInstance() {
        Hello hello = new HelloWorld();
        hello.morning("xiaoGou");
    }

    private static void dynamicProxyCreateInstance() {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("morning")) {
                    System.out.println("Good morning:" + args[0]);
                }
                return null;
            }
        };

        Hello hello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), new Class[]{Hello.class}, handler);
        hello.morning("xiaoGou");
    }
}
