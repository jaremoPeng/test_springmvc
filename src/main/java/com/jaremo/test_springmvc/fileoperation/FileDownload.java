package com.jaremo.test_springmvc.fileoperation;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.net.URLEncoder;

@Controller
public class FileDownload {

    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(String filename){
        String linkPath = "C:\\Users\\Administrator\\Desktop\\yiban\\"+filename;
        File file = new File(linkPath); // 创建文件

        HttpHeaders hh = new HttpHeaders(); // 创建响应头
        try {
            // 设置文件名的字符编码
            hh.setContentDispositionFormData("attchment" , URLEncoder.encode(filename,"UTF-8"));
            // 将文件转换成字节流
            byte[] filebytes = FileCopyUtils.copyToByteArray(file);

            ResponseEntity<byte[]> re = new ResponseEntity<byte[]>(filebytes , hh , HttpStatus.CREATED);
            return re;
        }catch (Exception e){
            throw  new RuntimeException(e.getMessage());
        }
    }
}
