package com.jaremo.test_springmvc.paging.service.impl;

import com.jaremo.test_springmvc.paging.PageTools;
import com.jaremo.test_springmvc.paging.dao.PageDao;
import com.jaremo.test_springmvc.paging.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PageServiceImpl implements PageService{
    @Autowired
    PageDao pageDao;

    @Override
    public PageTools query(int pagecode, int record) {
        return pageDao.findByPagecodeAndRecord(pagecode , record);
    }
}
