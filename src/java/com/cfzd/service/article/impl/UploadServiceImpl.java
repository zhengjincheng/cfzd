package com.cfzd.service.article.impl;

import java.io.File;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cfzd.bean.auction.Image;
import com.cfzd.bo.auction.FileUploadBO;
import com.cfzd.bo.auction.ImageBO;
import com.cfzd.dao.auction.ImageMapper;
import com.cfzd.service.auction.IUploadService;
@Service
public class UploadServiceImpl implements IUploadService {
	@Resource
	private ImageMapper dao;
	
	
	@Override
	public FileUploadBO upload(MultipartFile file, String path) {
		System.out.println("¿ªÊ¼");
        FileUploadBO bo=new FileUploadBO();
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
            bo.setUri("/upload/"+fileName);
            Image i=new Image();
            i.setImageUrl(bo.getUri());
            dao.insert(i);
            bo.setId(i.getId());
            bo.setIsSuccess(true);
        } catch (Exception e) {  
        	bo.setIsSuccess(false); 
        	bo.setMessage(e.getMessage());
        }  
        return bo;  
	}


	@Override
	public ImageBO find(Integer id){
		ImageBO bo=null;
		Image image= dao.selectByPrimaryKey(id);
		if (image!=null){
			bo=new ImageBO();
			bo.setId(image.getId());
			bo.setImageUrl(image.getImageUrl());
		}
		return bo;
	}

} 
