package com.cfzd.auction.service;

import java.util.Date;
import java.util.List;

public interface IAuctionService {
	/*创建拍场 */
	public Long CreateAuctions(Long imageId, String title, Date enddate);
	/*增加拍品*/
	public Long CreateAuction(List<Long> images, Integer catetory, String name, String desc, Long start_price,
			Long range, Long deposit, Long fixedPrice, boolean freeSipping, boolean backNoreason);
	
	
}
