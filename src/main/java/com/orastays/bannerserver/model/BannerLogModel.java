package com.orastays.bannerserver.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(Include.NON_NULL)
public class BannerLogModel extends CommonModel {

	@JsonProperty("bannerLogId")
	private String bannerLogId;
	
	@JsonProperty("bannerModels")
	private BannerModel bannerModels;
	
	@JsonProperty("bannerStartDatetime")
	private String bannerStartDatetime;
	
	@JsonProperty("bannerEndDatetime")
	private String bannerEndDatetime;
}
