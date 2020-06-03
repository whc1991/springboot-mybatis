package com.cloud.controller;


import com.sun.deploy.net.HttpResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@RestController
@RequestMapping("/picture")
@Slf4j
public class PictureController {

    @Value("${upload.picture.path}")
    private String uploadFilePath;

    @RequestMapping("/upload")
    @ResponseBody
    public String uploadPicture(@RequestParam("file") MultipartFile multipartFile){
        // 获取文件原始名称
        String originalFilename = multipartFile.getOriginalFilename();

        String filePathPrefix = System.getProperty("user.dir") + uploadFilePath;

        String filePath = filePathPrefix + originalFilename;


        try {
            if (!new File(filePathPrefix).exists()) {
                new File(filePathPrefix).mkdirs();
            }
            multipartFile.transferTo(new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
            log.error("上传图片失败，图片名称：{}", originalFilename);
            return "fail";
        }

        return filePath;
    }

    @RequestMapping("/upload1")
    @ResponseBody
    public void uploadPicture1(@RequestParam("file") MultipartFile multipartFile, HttpServletResponse httpServletResponse){
        // 获取文件原始名称
        String originalFilename = multipartFile.getOriginalFilename();

        String filePathPrefix = System.getProperty("user.dir") + uploadFilePath;

        String filePath = filePathPrefix + originalFilename;
        FileInputStream fis = null;
        ServletOutputStream outputStream = null;
        try {
            if (!new File(filePathPrefix).exists()) {
                new File(filePathPrefix).mkdirs();
            }
            File targetFile = new File(filePath);
            multipartFile.transferTo(targetFile);
            fis = new FileInputStream(targetFile);
            outputStream = httpServletResponse.getOutputStream();

            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
            }
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
            log.error("上传图片失败，图片名称：{}", originalFilename);
        }finally {

            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void getFile(){
        // https://www.jianshu.com/p/89251a9166d9
    }
}
