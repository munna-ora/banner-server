/**
 * @author Orastays Dev
 */
package com.orastays.bannerserver.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public abstract class CommonEntity implements Serializable {

	@Transient
	private static final long serialVersionUID = 1683565266278838752L;

	@Column(name = "status")
	private Integer status;

	@Column(name = "created_date")
	private String createdDate;

	@Column(name = "created_by")
	private Long createdBy;

	@Column(name = "modified_date")
	private String modifiedDate;

	@Column(name = "modified_by")
	private Long modifiedBy;

}