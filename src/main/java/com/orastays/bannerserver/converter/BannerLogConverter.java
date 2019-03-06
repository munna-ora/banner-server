package com.orastays.bannerserver.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.orastays.bannerserver.entity.BannerLogEntity;
import com.orastays.bannerserver.helper.Util;
import com.orastays.bannerserver.model.BannerLogModel;

@Component
public class BannerLogConverter extends CommonConverter implements BaseConverter<BannerLogEntity, BannerLogModel> {

	private static final long serialVersionUID = 8459487965515582888L;
	private static final Logger logger = LogManager.getLogger(BannerLogConverter.class);

	@Override
	public BannerLogEntity modelToEntity(BannerLogModel m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BannerLogModel entityToModel(BannerLogEntity e) {

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- START");
		}

		BannerLogModel bannerLogModel = new BannerLogModel();
		bannerLogModel = (BannerLogModel) Util.transform(modelMapper, e, bannerLogModel);

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- END");
		}

		return bannerLogModel;
	}

	@Override
	public List<BannerLogModel> entityListToModelList(List<BannerLogEntity> es) {

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- START");
		}

		List<BannerLogModel> bannerLogModels = null;
		if (!CollectionUtils.isEmpty(es)) {
			bannerLogModels = new ArrayList<>();
			for (BannerLogEntity bannerLogEntity : es) {
				bannerLogModels.add(entityToModel(bannerLogEntity));
			}
		}

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- END");
		}

		return bannerLogModels;
	}
}
