package com.jaremo.test_springmvc.fileoperation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FileUpload {

    @RequestMapping(value = "/upload" , method = RequestMethod.POST)
    public String upload(@RequestParam("file") MultipartFile mf){

        try{
            // 文件名
            String filename = new String(mf.getOriginalFilename().getBytes("utf-8"),"iso-8859-1");
            String savePath = "E:\\ideacode\\test_springmvc\\src\\main\\webapp\\images\\"+filename;
            mf.transferTo(new File(savePath));
            System.out.println(savePath);
        }catch(IOException e){
            throw new RuntimeException(e.getMessage());
        }
        return "/index.jsp";
    }
}
