package com.orastays.bannerserver.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.orastays.bannerserver.helper.Status;
import com.orastays.bannerserver.model.BannerModel;
import com.orastays.bannerserver.service.BannerService;

@Service
@Transactional
public class BannerServiceImpl extends BaseServiceImpl implements BannerService {
	
	private static final Logger logger = LogManager.getLogger(BannerServiceImpl.class);

	/*@Override
	public List<BannerModel> fetchBanners() {
		
		if (logger.isInfoEnabled()) {
			logger.info("fetchBanners -- START");
		}
		
		List<BannerModel> bannerModels = null;
		try {
			Map<String, String> innerMap1 = new LinkedHashMap<>();
			innerMap1.put("status", String.valueOf(Status.ACTIVE.ordinal()));
	
			Map<String, Map<String, String>> outerMap1 = new LinkedHashMap<>();
			outerMap1.put("eq", innerMap1);
	
			Map<String, Map<String, Map<String, String>>> alliasMap = new LinkedHashMap<>();
			alliasMap.put(entitymanagerPackagesToScan+".BannerEntity", outerMap1);
			
			bannerModels = new ArrayList<>();
			bannerModels = bannerConverter.entityListToModelList(bannerDAO.fetchListBySubCiteria(alliasMap));
			
		} catch (Exception e) {
		}
		
		if (logger.isInfoEnabled()) {
			logger.info("fetchBanners -- END");
		}
		
		return bannerModels;
	}*/
	@Override
	public List<BannerModel> fetchBannersByPageName(String pageName) {
		
		if (logger.isInfoEnabled()) {
			logger.info("fetchBannersByPage -- START");
		}
		
		List<BannerModel> bannerModels=null;
		try {
		Map<String,String> innerMap1=new LinkedHashMap<>();
		innerMap1.put("status", String.valueOf(Status.ACTIVE.ordinal()));
		innerMap1.put("pageName", pageName);
		
		Map<String, Map<String, String>> outerMap1 = new LinkedHashMap<>();
		outerMap1.put("eq", innerMap1);
		
		Map<String, Map<String, Map<String, String>>> alliasMap = new LinkedHashMap<>();
		alliasMap.put(entitymanagerPackagesToScan+".BannerEntity", outerMap1);

		bannerModels = bannerConverter.entityListToModelList(bannerDAO.fetchListBySubCiteria(alliasMap));
		} catch (Exception e) {
		}
		if (logger.isInfoEnabled()) {
			logger.info("fetchBannersByPage -- END");
		}
		return bannerModels;
		
	}
}