package com.jaremo.test_springmvc.paging;

import java.util.List;
import java.util.Map;

public class PageTools {
    private int pagecode; // 页码
    private int totalrecord; // 总记录数
    private int record; // 每页显示的记录数

    // 查询出来的记录
    private List<Map<String , Object>> recordList;

    // 总页数
    public int getTotalpage(){
        int result = totalrecord/record;
        if(result != 0){
            result = totalrecord/record+1;
        }
        return result;
    }

    public int getPagecode() {
        return pagecode;
    }

    public void setPagecode(int pagecode) {
        this.pagecode = pagecode;
    }

    public int getTotalrecord() {
        return totalrecord;
    }

    public void setTotalrecord(int totalrecord) {
        this.totalrecord = totalrecord;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public List<Map<String, Object>> getRecordList() {

        return recordList;
    }

    public void setRecordList(List<Map<String, Object>> recordList) {
        this.recordList = recordList;
    }
}
