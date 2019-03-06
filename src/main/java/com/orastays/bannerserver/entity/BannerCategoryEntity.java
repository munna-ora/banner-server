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
@Table(name = "master_banner_category")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BannerCategoryEntity extends CommonEntity {

	private static final long serialVersionUID = -1603058039549861451L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "banner_category_id")
	@JsonProperty("bannerCategoryId")
	private Long bannerCategoryId;

	@Column(name = "name")
	@JsonProperty("bannerCategoryName")
	private String bannerCategoryName;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE })
	@JoinColumn(name = "banner_type_id", nullable = false)
	@JsonProperty("bannerType")
	private BannerTypeEntity bannerTypeEntity;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bannerCategoryEntity", cascade = { CascadeType.ALL })
	@JsonProperty("banners")
	private List<BannerEntity> bannerEntity;
	
	@Override
	public String toString() {
		return Long.toString(bannerCategoryId);
	}
}
