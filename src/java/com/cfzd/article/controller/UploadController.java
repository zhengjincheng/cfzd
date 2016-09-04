package com.cfzd.article.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.cfzd.article.bo.FileUploadBO;
@Controller
public class UploadController {
	@RequestMapping(value="file",produces="application/json;charset=UTF-8")
	public @ResponseBody FileUploadBO upload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) {  		  
        System.out.println("¿ªÊ¼");
        FileUploadBO bo=new FileUploadBO();
        String path = request.getSession().getServletContext().getRealPath("upload");  
        String fileName = file.getOriginalFilename();  
//        String fileName = new Date().getTime()+".jpg";  
        System.out.println(path);  
        File targetFile = new File(path, fileName);  
        if(!targetFile.exists()){  
            targetFile.mkdirs();  
        }  
        //±£´æ  
        try { 
            file.transferTo(targetFile); 
            bo.setIsSuccess(true);
            bo.setUri("/upload/"+fileName);
        } catch (Exception e) {  
        	bo.setIsSuccess(false); 
        	bo.setMessage(e.getMessage());
        }  
        return bo;  
    }  
}
