package com.orastays.bannerserver.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.orastays.bannerserver.converter.BannerConverter;
import com.orastays.bannerserver.dao.BannerDAO;

public abstract class BaseServiceImpl {

	@Value("${entitymanager.packagesToScan}")
	protected String entitymanagerPackagesToScan;
	
	@Autowired
	protected BannerDAO bannerDAO;
	
	@Autowired
	protected BannerConverter bannerConverter;
}
