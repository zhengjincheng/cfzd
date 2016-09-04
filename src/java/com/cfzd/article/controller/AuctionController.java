package com.cfzd.article.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AuctionController {
	@RequestMapping("zijianpaichang")
	public String createAuctions(Model m){
		return "zijianpaichang";
	}

}
