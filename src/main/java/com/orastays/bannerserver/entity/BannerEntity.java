package com.orastays.bannerserver.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "master_banner")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BannerEntity extends CommonEntity {

	private static final long serialVersionUID = -7664579667388559362L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "banner_id")
	@JsonProperty("bannerId")
	private Long bannerId;

	@Column(name = "banner_img_url")
	@JsonProperty("bannerImgUrl")
	private String bannerImgUrl;

	@Column(name = "banner_description")
	@JsonProperty("bannerDescription")
	private String bannerDescription;
	
	@Column(name = "banner_link")
	@JsonProperty("bannerLink")
	private String bannerLink;
	
	@Column(name = "title")
	@JsonProperty("title")
	private String title;
	
	@Column(name = "sub_title")
	@JsonProperty("subTitle")
	private String subTitle;
	
	@Column(name = "page_name")
	@JsonProperty("pageName")
	private String pageName;
	
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE })
	@JoinColumn(name = "banner_category_id", nullable = false)
	@JsonProperty("bannerCategory")
	private BannerCategoryEntity bannerCategoryEntity;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bannerEntity", cascade = { CascadeType.ALL })
	@JsonProperty("bannerLogs")
	private List<BannerLogEntity> bannerLogEntity;
	
	@Override
	public String toString() {
		return Long.toString(bannerId);
	}
}
