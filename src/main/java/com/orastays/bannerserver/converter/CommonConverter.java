package com.orastays.bannerserver.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.orastays.bannerserver.helper.MessageUtil;

public class CommonConverter {

	@Autowired
	protected ModelMapper modelMapper;

	@Autowired
	protected RestTemplate restTemplate;

	@Autowired
	protected MessageUtil messageUtil;
	
	@Autowired
	protected BannerCategoryConverter bannerCategoryConverter;
	
	@Autowired
	protected BannerTypeConverter bannerTypeConverter;
}
