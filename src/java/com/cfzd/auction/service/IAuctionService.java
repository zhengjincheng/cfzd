package com.cfzd.auction.service;

import java.util.Date;
import java.util.List;

public interface IAuctionService {
	/*�����ĳ� */
	public Long CreateAuctions(Long imageId, String title, Date enddate);
	/*������Ʒ*/
	public Long CreateAuction(List<Long> images, Integer catetory, String name, String desc, Long start_price,
			Long range, Long deposit, Long fixedPrice, boolean freeSipping, boolean backNoreason);
	
	
}
