package com.cfzd.service.article.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cfzd.bean.auction.Auction;
import com.cfzd.bean.auction.AuctionImage;
import com.cfzd.bean.auction.Auctions;
import com.cfzd.bo.auction.AuctionBO;
import com.cfzd.bo.auction.AuctionsBO;
import com.cfzd.bo.auction.ImageBO;
import com.cfzd.bo.auction.ResultBO;
import com.cfzd.dao.auction.AuctionImageMapper;
import com.cfzd.dao.auction.AuctionMapper;
import com.cfzd.dao.auction.AuctionsMapper;
import com.cfzd.service.auction.IAuctionService;
import com.cfzd.service.auction.IUploadService;

@Service
public class AuctionServiceImpl implements IAuctionService {
	final static Integer AUCTIONS_IMAGE = 1;
	final static Integer AUCTION_IMAGE = 2;

	final static Integer AUCTION_STATUS_NEW = 1;
	final static Integer AUCTION_STATUS_PUBLISH = 2;

	@Resource
	AuctionsMapper auctionsDAO;
	@Resource
	AuctionMapper auctionDAO;
	@Resource
	AuctionImageMapper auctionImageDAO;
	@Resource
	IUploadService uploadService;

	@Override
	public ResultBO createAuctionsdraft(Integer imageId, String title, List<Integer> autionids, String zskt,
			Date endtime) {
		ResultBO bo = new ResultBO();
		if (StringUtils.isEmpty(imageId)) {
			bo.setMessage("imageId 不能为空");
			bo.setIsSuccess(false);
			return bo;
		}
		if (uploadService.find(imageId) == null) {
			bo.setMessage("imageId 找不到对应图片");
			bo.setIsSuccess(false);
			return bo;
		}
		Auctions autions = new Auctions();
		autions.setName(title);
		autions.setStatus(AUCTION_STATUS_NEW);
		autions.setEndtime(endtime);
		auctionsDAO.insert(autions);
		AuctionImage ai = new AuctionImage();
		ai.setRefid(autions.getId());
		ai.setImageid(imageId);
		ai.setType(AUCTIONS_IMAGE);
		auctionImageDAO.insert(ai);
		bo.setIsSuccess(true);
		return bo;
	}

	@Override
	public @ResponseBody ResultBO updateAuctionsdraft(Integer auctionsId, Integer imageId, String title,
			List<Integer> autionids, String zskt, Date endtime) {
		ResultBO bo = new ResultBO();
		Auctions autions = auctionsDAO.selectByPrimaryKey(auctionsId);
		autions.setId(auctionsId);
		autions.setName(title);
		auctionsDAO.updateByPrimaryKey(autions);
		// 更新AuctionImage
		List<AuctionImage> images = auctionImageDAO.selectByTypeAndRef(AUCTIONS_IMAGE, auctionsId);
		if (!images.isEmpty()) {
			images.get(0).setImageid(imageId);
			auctionImageDAO.updateByPrimaryKey(images.get(0));
		}
		
		
		bo.setIsSuccess(true);
		return bo;
	}

	@Override
	public ResultBO publishAuctions(Integer id) {
		ResultBO bo = new ResultBO();
		Auctions autions = auctionsDAO.selectByPrimaryKey(id);
		autions.setStatus(AUCTION_STATUS_PUBLISH);
		auctionsDAO.updateByPrimaryKey(autions);
		bo.setIsSuccess(true);
		return bo;
	}

	@Override
	public AuctionsBO getAuctions(Integer id) {
		AuctionsBO bo = new AuctionsBO();
		Auctions autions = auctionsDAO.selectByPrimaryKey(id);
		bo.setId(autions.getId());
		bo.setName(autions.getName());
		bo.setEndtime(autions.getEndtime());
		List<AuctionImage> images = auctionImageDAO.selectByTypeAndRef(AUCTIONS_IMAGE, id);
		List<ImageBO> imageBOs = toImageBOs(images);
		if (images != null && !images.isEmpty()) {
			bo.setImage(imageBOs.get(0));
		}
		List<Auction> list = auctionDAO.selectByAuctionsId(id);
		if (list!=null && !list.isEmpty()){
			 List<AuctionBO> bos =new ArrayList<AuctionBO>();
			 for  (Auction auction:list){
					AuctionBO abo=getAuction(auction.getId());
					bos.add(abo);
				}
			 bo.setAutions(bos); 
		}
		return bo;
	}

	@Override
	public AuctionBO getAuction(Integer id) {
		Auction a = auctionDAO.selectByPrimaryKey(id);
		AuctionBO bo = toBO(a);
		List<AuctionImage> images = auctionImageDAO.selectByTypeAndRef(AUCTION_IMAGE, id);
		bo.setImages(toImageBOs(images));
		bo.setIsSuccess(true);
		return bo;
	}

	public static AuctionBO toBO(Auction a) {
		AuctionBO bo = null;
		if (a != null) {
			bo = new AuctionBO();
			bo.setAddrange(a.getAddrange());
			bo.setName(a.getName());
			bo.setDescription(a.getDescription());
			bo.setDeposit(a.getDeposit());
			bo.setFixedPrice(a.getFixedPrice());
			bo.setEndtime(a.getEndtime());
			bo.setParent(a.getParent());
			bo.setStartPrice(a.getStartPrice());
		}
		return bo;

	}

	public static List<ImageBO> toImageBOs(List<AuctionImage> images) {
		List<ImageBO> list = null;
		if (images != null && !images.isEmpty()) {
			list = new ArrayList<ImageBO>();
			for (AuctionImage image : images) {
				ImageBO imgebo = new ImageBO();
				imgebo.setId(image.getImageid());
				imgebo.setImageUrl(image.getImageUrl());
				list.add(imgebo);
			}
		}
		return list;
	}

	@Override
	public ResultBO createAuctiondraft(List<Integer> imagesIds) {
		ResultBO bo = new ResultBO();
		if (imagesIds != null && !imagesIds.isEmpty()) {
			Auction aution = new Auction();
			auctionDAO.insert(aution);
			for (Integer imageId : imagesIds) {
				AuctionImage ai = new AuctionImage();
				ai.setRefid(aution.getId());
				ai.setImageid(imageId);
				ai.setType(AUCTION_IMAGE);
				auctionImageDAO.insert(ai);
				
			}
			bo.setIsSuccess(true);
		}
		return bo;
	}

	@Override
	public ResultBO updateAuctiondraft(List<Integer> imagesIds, Integer auctionId) {
		
		return null;
	}

	@Override
	public ResultBO updateAuctiondraft(AuctionBO auction) {
		return null;
	}

}
