package org.sheshui.mynotebook;

/**
 * 函数接口声明
 * 函数接口只有一个未实现的方法
 * @author sunjiarui
 */
@FunctionalInterface
interface StringUtil {
    /**
     * 格式化字符串
     * @param str 入参
     * @return 格式化后的字符串
     */
    String format(String str);
}