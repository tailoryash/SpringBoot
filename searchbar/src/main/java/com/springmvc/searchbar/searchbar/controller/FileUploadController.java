package com.springmvc.searchbar.searchbar.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class FileUploadController {
    @RequestMapping("fileUpload")
    public String fileUpload(){
        return "fileUpload";
    }
    @RequestMapping(value = "/uploadImage", method = RequestMethod.POST)
    public String uploadImage(@RequestParam("image")MultipartFile file, HttpSession s, Model model) throws IOException {
//        System.out.println(file.getName());
//        System.out.println(file.getSize());

        byte[] data = file.getBytes();
        String path = s.getServletContext().getRealPath("/") + "images" + File.separator + file.getOriginalFilename();
        System.out.println(path);
        try{
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
            System.out.println("File uploaded");
            model.addAttribute("filename", file.getOriginalFilename());
            model.addAttribute("msg", "Uploaded successfully");

        }catch (IOException e){
            e.printStackTrace();
            System.out.println("uploading error");
            model.addAttribute("msg", "Uploaded Error");
        }
        return "filesuccess";
    }
}
