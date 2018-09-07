package com.jaremo.test_springmvc.paging.dao.impl;

import com.jaremo.test_springmvc.bean.User;
import com.jaremo.test_springmvc.paging.PageTools;
import com.jaremo.test_springmvc.paging.dao.PageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class PageDaoImpl implements PageDao{
    @Autowired
    private JdbcTemplate jt;

    @Override
    public PageTools findByPagecodeAndRecord(int pagecode, int record) {
        int totalrecord = getTotalRecord(); // 得到总记录数
        PageTools pt = new PageTools(); // 分页实体类
        pt.setPagecode(pagecode); // 封装页码
        pt.setRecord(record); // 封装每页显示的条数
        pt.setTotalrecord(totalrecord); // 设置总记录数
        String sql = "select * from user limit "+((pagecode-1)*record)+" , "+record;
        List<Map<String , Object>> recordList = jt.queryForList(sql); // 设置记录集合
        pt.setRecordList(recordList);
        return pt;
    }

    @Override
    public int getTotalRecord() {
        String sql = "select count(*) as ct from user";
        List<Map<String , Object>> resultList =  jt.queryForList(sql);
        String result = String.valueOf(resultList.get(0).get("ct"));
        return Integer.valueOf(result);
    }
}
