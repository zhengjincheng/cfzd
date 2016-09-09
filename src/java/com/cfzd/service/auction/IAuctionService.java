package com.cfzd.service.auction;

import java.util.Date;
import java.util.List;

import com.cfzd.bo.auction.AuctionBO;
import com.cfzd.bo.auction.AuctionsBO;
import com.cfzd.bo.auction.ResultBO;

public interface IAuctionService {
	//创建拍场草稿
	public ResultBO createAuctionsdraft(Integer imageId, String title, List<Integer> autionids, String zskt, Date endtime);	
	
	//更新拍场草稿
	public ResultBO updateAuctionsdraft(Integer auctionsId,Integer imageId, String title, List<Integer> autionids, String zskt, Date endtime);	
		
	//发布拍场
	public ResultBO publishAuctions(Integer id);	
	//根据拍场id获取拍场信息
	public AuctionsBO getAuctions(Integer id);
	//根据拍品id获取拍品信息
	public AuctionBO getAuction(Integer id);
	//添加拍品时点击下一步 
	public ResultBO createAuctiondraft(List<Integer> imagesId);
	//更新图片信息
	public ResultBO updateAuctiondraft(List<Integer> imagesIds,Integer auctionId);
	//更新拍品信息 
	//验证信息拍品信息的完整性
	public ResultBO updateAuctiondraft(AuctionBO auction);
}