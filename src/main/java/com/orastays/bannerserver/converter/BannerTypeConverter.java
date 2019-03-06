package com.orastays.bannerserver.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.orastays.bannerserver.entity.BannerTypeEntity;
import com.orastays.bannerserver.helper.Util;
import com.orastays.bannerserver.model.BannerTypeModel;

@Component
public class BannerTypeConverter extends CommonConverter implements BaseConverter<BannerTypeEntity, BannerTypeModel> {

	private static final long serialVersionUID = 39387060610602689L;
	private static final Logger logger = LogManager.getLogger(BannerTypeConverter.class);

	@Override
	public BannerTypeEntity modelToEntity(BannerTypeModel m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BannerTypeModel entityToModel(BannerTypeEntity e) {

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- START");
		}

		BannerTypeModel bannerTypeModel = new BannerTypeModel();
		bannerTypeModel = (BannerTypeModel) Util.transform(modelMapper, e, bannerTypeModel);

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- END");
		}

		return bannerTypeModel;
	}

	@Override
	public List<BannerTypeModel> entityListToModelList(List<BannerTypeEntity> es) {

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- START");
		}

		List<BannerTypeModel> bannerTypeModels = null;
		if (!CollectionUtils.isEmpty(es)) {
			bannerTypeModels = new ArrayList<>();
			for (BannerTypeEntity bannerTypeEntity : es) {
				bannerTypeModels.add(entityToModel(bannerTypeEntity));
			}
		}

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- END");
		}

		return bannerTypeModels;
	}
}
