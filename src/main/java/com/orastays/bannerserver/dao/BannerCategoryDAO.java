package com.orastays.bannerserver.dao;

import org.springframework.stereotype.Repository;

import com.orastays.bannerserver.entity.BannerCategoryEntity;

@Repository
public class BannerCategoryDAO extends GenericDAO<BannerCategoryEntity, Long> {

	private static final long serialVersionUID = 5212537244478907599L;

	public BannerCategoryDAO() {
		super(BannerCategoryEntity.class);
	}
}
