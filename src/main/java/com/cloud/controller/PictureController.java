package com.cloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

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

        return "success,图片路径：" + filePath;
    }
}
