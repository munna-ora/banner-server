package com.orastays.bannerserver.dao;

import org.springframework.stereotype.Repository;

import com.orastays.bannerserver.entity.BannerEntity;

@Repository
public class BannerDAO extends GenericDAO<BannerEntity, Long> {

	private static final long serialVersionUID = -4437039139464131763L;

	public BannerDAO() {
		super(BannerEntity.class);
	}
}
