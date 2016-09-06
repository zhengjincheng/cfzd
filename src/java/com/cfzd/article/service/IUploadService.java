package com.cfzd.article.service;

import org.springframework.web.multipart.MultipartFile;

import com.cfzd.article.bo.FileUploadBO;

public interface IUploadService {
	public FileUploadBO upload(MultipartFile file,String targetPath);
}
