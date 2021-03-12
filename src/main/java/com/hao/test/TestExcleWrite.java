package com.hao.test;

import com.alibaba.excel.EasyExcel;
import com.hao.test.ExcleObject.DemoData;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wrh
 * @Date 2021/3/2 21:55
 * @Version 1.0
 */


public class TestExcleWrite {
    public static void main(String[] args) {
        String fileName="E:\\1.xlsx";
        EasyExcel.write(fileName, DemoData.class).sheet("测试写").doWrite(data());
    }
//循环设置要添加的数据，最终封装到list集合中
    private static List<DemoData> data() {
        List<DemoData> list = new ArrayList<DemoData>();
        for (int i = 0; i < 10; i++) {
            DemoData data = new DemoData();
            data.setSno(i);
            data.setSname("张三"+i);
            list.add(data);
        }
        return list;
    }
}
