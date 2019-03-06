package com.orastays.bannerserver.model;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class BannerCategoryModel extends CommonModel {

	private String bannerCategoryId;
	private String bannerCategoryName;
	private BannerTypeModel bannerTypeModels;
	private List<BannerModel> bannerModels;
}
