package com.hlllg.shine.once;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author hlllg
 * @Date 2024/3/11 21:10
 */
@Data
public class UserInfo {

    /**
     * 成员编号
     */
    @ExcelProperty("成员编号")
    private String planetCode;

    /**
     * 成员昵称
     */
    @ExcelProperty("成员昵称")
    private String username;

}