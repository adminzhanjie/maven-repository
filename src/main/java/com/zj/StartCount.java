package com.zj;

import org.springframework.util.ObjectUtils;

public class StartCount {

    /**
     * 计算相加
     */
    public static Integer addRun(Integer a, Integer b) {
        if (ObjectUtils.isEmpty(a) || ObjectUtils.isEmpty(b)) {
            throw new RuntimeException("Parameters are not allowed to be null ！");
        }
        return a + b;

    }
}
