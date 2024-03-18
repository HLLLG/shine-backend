package com.hlllg.shine.once;

import com.alibaba.excel.EasyExcel;

import java.io.File;
import java.util.List;

/**
 * @author hlllg
 * @Date 2024/3/11 21:10
 */
public class ImportExcel {

    public static void main(String[] args) {
        String fileName = "D:\\Code\\IDEA_Project\\shine-backend\\src\\main\\resources\\testExcel.xlsx";
        synchronousRead(fileName);
    }

    /**
     * 同步读，将所有数据全部获取
     */
    public static void synchronousRead(String fileName) {
        List<UserInfo> totalDataList = EasyExcel.read(fileName).head(UserInfo.class).sheet().doReadSync();
        for (UserInfo userInfo : totalDataList) {
            System.out.println(userInfo);
        }
    }
}
