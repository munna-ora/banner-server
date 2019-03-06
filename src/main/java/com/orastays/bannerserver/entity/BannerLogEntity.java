package com.orastays.bannerserver.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "banner_log")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BannerLogEntity extends CommonEntity {

	private static final long serialVersionUID = 7449281427602269363L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "banner_log_id")
	@JsonProperty("bannerLogId")
	private Long bannerLogId;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.MERGE })
	@JoinColumn(name = "banner_id", nullable = false)
	@JsonProperty("banner")
	private BannerEntity bannerEntity;

	@Column(name = "start_datetime")
	@JsonProperty("bannerStartDatetime")
	private String bannerStartDatetime;
	
	@Column(name = "end_datetime")
	@JsonProperty("bannerEndDatetime")
	private String bannerEndDatetime;
	
	@Override
	public String toString() {
		return Long.toString(bannerLogId);
	}
}
