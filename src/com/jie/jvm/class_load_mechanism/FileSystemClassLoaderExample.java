package com.jie.jvm.class_load_mechanism;


/**
 * @author hexiaogou
 * @classname FileSystemClassLoaderExample
 * @description TODO
 * @date 2022/1/26 14:24
 */
public class FileSystemClassLoaderExample {
    public static void main(String[] args) throws Exception {
        String rootDir = "/Users/hexiaogou/Git_House_For_Mine/java_base_knowledge/src/com/jie/test";

        FileSystemClassLoader fileSystemClassLoader = new FileSystemClassLoader(rootDir);

        Class<?> testClass = fileSystemClassLoader.findClass("Test");
        System.out.println(testClass);
    }
}
