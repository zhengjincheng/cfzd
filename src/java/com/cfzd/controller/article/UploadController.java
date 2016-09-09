package com.cfzd.controller.article;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.cfzd.bo.auction.FileUploadBO;
import com.cfzd.service.auction.IUploadService;
@Controller
public class UploadController {
	
	@Resource
	private IUploadService service;
	
	@RequestMapping(value="file",produces="application/json;charset=UTF-8")
	public @ResponseBody FileUploadBO upload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) {  		  
        String path = request.getSession().getServletContext().getRealPath("upload");  
        FileUploadBO bo=service.upload(file, path);
        return bo;
    }  
}
