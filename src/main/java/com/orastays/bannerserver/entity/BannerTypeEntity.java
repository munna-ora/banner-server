package com.orastays.bannerserver.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "master_banner_type")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BannerTypeEntity extends CommonEntity {

	private static final long serialVersionUID = -8272649760267238798L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "banner_type_id")
	@JsonProperty("bannerTypeId")
	private Long bannerTypeId;

	@Column(name = "name")
	@JsonProperty("bannerTypeName")
	private String bannerTypeName;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bannerTypeEntity", cascade = { CascadeType.ALL })
	@JsonProperty("bannerCategorys")
	private List<BannerCategoryEntity> bannerCategoryEntity;
	
	@Override
	public String toString() {
		return Long.toString(bannerTypeId);
	}
}
