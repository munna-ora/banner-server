package com.orastays.bannerserver.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.orastays.bannerserver.entity.BannerEntity;
import com.orastays.bannerserver.helper.Util;
import com.orastays.bannerserver.model.BannerModel;

@Component
public class BannerConverter extends CommonConverter implements BaseConverter<BannerEntity, BannerModel> {

	private static final long serialVersionUID = -2077922877250704988L;
	private static final Logger logger = LogManager.getLogger(BannerConverter.class);

	@Override
	public BannerEntity modelToEntity(BannerModel m) {
		return null;
	}

	@Override
	public BannerModel entityToModel(BannerEntity e) {

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- START");
		}

		BannerModel bannerModel = new BannerModel();
		bannerModel = (BannerModel) Util.transform(modelMapper, e, bannerModel);
		bannerModel.setBannerCategoryModels(bannerCategoryConverter.entityToModel(e.getBannerCategoryEntity()));

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- END");
		}

		return bannerModel;
	}

	@Override
	public List<BannerModel> entityListToModelList(List<BannerEntity> es) {

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- START");
		}

		List<BannerModel> bannerModels = null;
		if (!CollectionUtils.isEmpty(es)) {
			bannerModels = new ArrayList<>();
			for (BannerEntity bannerEntity : es) {
				System.out.println("=========="+es);
				bannerModels.add(entityToModel(bannerEntity));
			}
		}

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- END");
		}

		return bannerModels;
	}
}