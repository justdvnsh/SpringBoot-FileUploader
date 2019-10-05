package com.example.springboothelloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class uploadController {

    Map<String, Object> result = new HashMap<>();

    @RequestMapping("/upload")
    public Map<String, Object> upload(@RequestParam("attach")MultipartFile file) throws IOException {

        System.out.println("File Name = " + file.getOriginalFilename());
        System.out.println("File Type = " + file.getContentType());

//        String filePath = "~/Spring-apps/spring-boot-helloworld/";
        file.transferTo(new File(file.getOriginalFilename()));
        result.put("Success", true);
        return result;
    }

}
