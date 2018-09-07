package com.jaremo.test_springmvc.paging.controller;

import com.jaremo.test_springmvc.paging.PageTools;
import com.jaremo.test_springmvc.paging.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @Autowired
    PageService pageService;

    @RequestMapping("/pagefind")
    public String find(String pc , Model model){
        int pagecode = Integer.parseInt(pc);
        int record = Integer.parseInt("2");
        PageTools pt = pageService.query(pagecode , record);
        model.addAttribute("pageTools" , pt);
        return "/restpratice/show.jsp";
    }
}
