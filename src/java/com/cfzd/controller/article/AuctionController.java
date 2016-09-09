package com.cfzd.controller.article;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cfzd.bo.auction.AuctionsBO;
import com.cfzd.bo.auction.ResultBO;
import com.cfzd.service.auction.IAuctionService;

@Controller
@RequestMapping(value = "auction")
public class AuctionController {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@Resource
	IAuctionService service;

	@RequestMapping("add-auctions")
	public String addOrEditAuctions(Model m) {
//		m.addAttribute("auctions", bo);
		return "add-auctions";
	}
	@RequestMapping("edit-auctions")
	public String addOrEditAuctions(@RequestParam Integer auctionsId, Model m) {
		//AuctionsBO bo = service.getAuctions(auctionsId);
		m.addAttribute("auctionsId", auctionsId);
		return "add-auctions";
	}
	@RequestMapping(value="getAuctions" , method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
	public @ResponseBody AuctionsBO getAuctions(@RequestParam Integer auctionsId) {
		AuctionsBO bo = service.getAuctions(auctionsId);
		return bo;
	}
	@RequestMapping(value = "savedraft", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public @ResponseBody ResultBO savedraft(@RequestParam Integer imageId, @RequestParam String title,
			@RequestParam("autionids[]") List<Integer> autionids, @RequestParam String zskt,
			@RequestParam Date endtime) {
		ResultBO bo = service.createAuctionsdraft(imageId, title, autionids, zskt, endtime);
		return bo;
	}

}
