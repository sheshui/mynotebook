package org.sheshui.mynotebook;

/**
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