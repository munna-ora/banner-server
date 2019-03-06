package com.orastays.bannerserver.service;

import java.util.List;

import com.orastays.bannerserver.model.BannerModel;

public interface BannerService {
	
	//List<BannerModel> fetchBanners();
	List<BannerModel> fetchBannersByPageName(String pageName);
}