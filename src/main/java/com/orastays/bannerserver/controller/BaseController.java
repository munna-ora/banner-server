package com.orastays.bannerserver.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.orastays.bannerserver.helper.MessageUtil;
import com.orastays.bannerserver.service.BannerService;

public class BaseController {

	@Autowired
	protected HttpServletRequest request;
	
	@Autowired
	protected HttpServletResponse response;
	
	@Autowired
	protected BannerService bannerService;
	
	@Autowired
	protected MessageUtil messageUtil;
}
