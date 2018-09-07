package com.jaremo.test_springmvc.paging.dao;

import com.jaremo.test_springmvc.paging.PageTools;

import java.util.List;
import java.util.Map;

public interface PageDao {

    int getTotalRecord();

    PageTools findByPagecodeAndRecord(int pagecode , int record);



}
