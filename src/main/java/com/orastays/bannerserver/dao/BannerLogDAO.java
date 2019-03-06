package com.orastays.bannerserver.dao;

import org.springframework.stereotype.Repository;

import com.orastays.bannerserver.entity.BannerLogEntity;

@Repository
public class BannerLogDAO extends GenericDAO<BannerLogEntity, Long> {

	private static final long serialVersionUID = 716856615404434021L;

	public BannerLogDAO() {
		super(BannerLogEntity.class);
	}

}
