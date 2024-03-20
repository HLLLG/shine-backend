package com.hlllg.shine.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hlllg
 * @Date 2024/3/20 13:10
 * 请求页面的类
 */
@Data
public class PageRequest implements Serializable {

    private static final long serialVersionUID = -5164890026502779172L;

    /**
     * 页面大小
     */
    protected int pageSize = 10;

    /**
     * 第几页
     */
    protected int pageNum = 1;
}
