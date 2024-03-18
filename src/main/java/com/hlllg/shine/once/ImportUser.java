package com.hlllg.shine.once;

import com.alibaba.excel.EasyExcel;

import java.util.List;

/**
 * @author hlllg
 * @Date 2024/3/11 21:25
 * 导入用户信息到数据库
 */
public class ImportUser {
    public static void main(String[] args) {
        String fileName = "D:\\Code\\IDEA_Project\\shine-backend\\src\\main\\resources\\testExcel.xlsx";
        List<UserInfo> totalDataList = EasyExcel.read(fileName).head(UserInfo.class).sheet().doReadSync();
        System.out.println("总数 = " + totalDataList.size());
    }
}
