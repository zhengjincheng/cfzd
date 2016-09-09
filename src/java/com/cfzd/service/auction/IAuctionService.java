package com.cfzd.service.auction;

import java.util.Date;
import java.util.List;

import com.cfzd.bo.auction.AuctionBO;
import com.cfzd.bo.auction.AuctionsBO;
import com.cfzd.bo.auction.ResultBO;

public interface IAuctionService {
	//�����ĳ��ݸ�
	public ResultBO createAuctionsdraft(Integer imageId, String title, List<Integer> autionids, String zskt, Date endtime);	
	
	//�����ĳ��ݸ�
	public ResultBO updateAuctionsdraft(Integer auctionsId,Integer imageId, String title, List<Integer> autionids, String zskt, Date endtime);	
		
	//�����ĳ�
	public ResultBO publishAuctions(Integer id);	
	//�����ĳ�id��ȡ�ĳ���Ϣ
	public AuctionsBO getAuctions(Integer id);
	//������Ʒid��ȡ��Ʒ��Ϣ
	public AuctionBO getAuction(Integer id);
	//�����Ʒʱ�����һ�� 
	public ResultBO createAuctiondraft(List<Integer> imagesId);
	//����ͼƬ��Ϣ
	public ResultBO updateAuctiondraft(List<Integer> imagesIds,Integer auctionId);
	//������Ʒ��Ϣ 
	//��֤��Ϣ��Ʒ��Ϣ��������
	public ResultBO updateAuctiondraft(AuctionBO auction);
}