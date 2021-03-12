package com.hao.test.ExcleObject;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * @Author wrh
 * @Date 2021/3/2 21:57
 * @Version 1.0
 */


public class DemoData {


//设置表头和添加的数据字段

        //设置表头名称

        @ExcelProperty("学生编号")

        private int sno;

        //设置表头名称

        @ExcelProperty("学生姓名")

        private String sname;

        public int getSno() {

            return sno;

        }

        public void setSno(int sno) {

            this.sno = sno;

        }
    public String getSname() {

            return sname;

        }

        public void setSname(String sname) {

            this.sname = sname;

        }

        @Override

        public String toString() {

            return "DemoData{" +

            "sno=" + sno +

            ", sname='" + sname + '\'' +

            '}';

        }

}
