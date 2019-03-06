package com.orastays.bannerserver.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.orastays.bannerserver.entity.BannerCategoryEntity;
import com.orastays.bannerserver.helper.Util;
import com.orastays.bannerserver.model.BannerCategoryModel;

@Component
public class BannerCategoryConverter extends CommonConverter implements BaseConverter<BannerCategoryEntity, BannerCategoryModel> {

	private static final long serialVersionUID = -7229320970099163831L;
	private static final Logger logger = LogManager.getLogger(BannerCategoryConverter.class);

	@Override
	public BannerCategoryEntity modelToEntity(BannerCategoryModel m) {
		return null;
	}

	@Override
	public BannerCategoryModel entityToModel(BannerCategoryEntity e) {

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- START");
		}

		BannerCategoryModel bannerCategoryModel = new BannerCategoryModel();
		bannerCategoryModel = (BannerCategoryModel) Util.transform(modelMapper, e, bannerCategoryModel);
		bannerCategoryModel.setBannerTypeModels(bannerTypeConverter.entityToModel(e.getBannerTypeEntity()));

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- END");
		}

		return bannerCategoryModel;
	}

	@Override
	public List<BannerCategoryModel> entityListToModelList(List<BannerCategoryEntity> es) {

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- START");
		}

		List<BannerCategoryModel> bannerCategoryModels = null;
		if (!CollectionUtils.isEmpty(es)) {
			bannerCategoryModels = new ArrayList<>();
			for (BannerCategoryEntity bannerCategoryEntity : es) {
				bannerCategoryModels.add(entityToModel(bannerCategoryEntity));
			}
		}

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- END");
		}

		return bannerCategoryModels;
	}
}
