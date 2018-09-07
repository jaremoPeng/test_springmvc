package com.jaremo.test_springmvc.paging.service;

import com.jaremo.test_springmvc.paging.PageTools;

public interface PageService {

    PageTools query(int pagecode , int record);
}
