package com.orastays.bannerserver.dao;

import org.springframework.stereotype.Repository;

import com.orastays.bannerserver.entity.BannerTypeEntity;

@Repository
public class BannerTypeDAO extends GenericDAO<BannerTypeEntity, Long> {

	private static final long serialVersionUID = -6602079100622569696L;

	public BannerTypeDAO() {
		super(BannerTypeEntity.class);
	}


}
