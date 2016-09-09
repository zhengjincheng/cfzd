package com.cfzd.service.auction;

import org.springframework.web.multipart.MultipartFile;

import com.cfzd.bo.auction.FileUploadBO;
import com.cfzd.bo.auction.ImageBO;

public interface IUploadService {
	public FileUploadBO upload(MultipartFile file,String targetPath);
	public ImageBO find(Integer id);
}
