package com.orastays.bannerserver.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orastays.bannerserver.helper.BannerConstant;
import com.orastays.bannerserver.helper.Util;
import com.orastays.bannerserver.model.BannerModel;
import com.orastays.bannerserver.model.ResponseModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
@Api(value = "Banner", tags = "Banner")
public class BannerController extends BaseController {
	
private static final Logger logger = LogManager.getLogger(BannerController.class);
	
	/*@GetMapping(value = "/fetch-banners", produces = "application/json")
	@ApiOperation(value = "Fetch Banner", response = ResponseModel.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
			@ApiResponse(code = 201, message = "Please Try after Sometime!!!") })
	public ResponseEntity<ResponseModel> fetchBanners() {
	
		if (logger.isInfoEnabled()) {
			logger.info("fetchBanners -- START");
		}

		ResponseModel responseModel = new ResponseModel();
		Util.printLog(null, BannerConstant.INCOMING, "Fetch Banner", request);
		try {
			List<BannerModel> bannerModels = bannerService.fetchBanners();
			responseModel.setResponseBody(bannerModels);
			responseModel.setResponseCode(messageUtil.getBundle(BannerConstant.COMMON_SUCCESS_CODE));
			responseModel.setResponseMessage(messageUtil.getBundle(BannerConstant.COMMON_SUCCESS_MESSAGE));
		} catch (Exception e) {
			if (logger.isInfoEnabled()) {
				logger.info("Exception in Fetch Banner -- "+Util.errorToString(e));
			}
			responseModel.setResponseCode(messageUtil.getBundle(BannerConstant.COMMON_ERROR_CODE));
			responseModel.setResponseMessage(messageUtil.getBundle(BannerConstant.COMMON_ERROR_MESSAGE));
		}
		
		Util.printLog(responseModel, BannerConstant.OUTGOING, "Fetch Banner", request);

		if (logger.isInfoEnabled()) {
			logger.info("fetchBanners -- END");
		}
		
		if (responseModel.getResponseCode().equals(messageUtil.getBundle(BannerConstant.COMMON_SUCCESS_CODE))) {
			return new ResponseEntity<>(responseModel, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(responseModel, HttpStatus.BAD_REQUEST);
		}
	}*/

@GetMapping(value = "/fetch-banners-by-page", produces = "application/json")
@ApiOperation(value = "fetch-banners-by-page", response = ResponseModel.class)
@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
		@ApiResponse(code = 201, message = "Please Try after Sometime!!!") })
public ResponseEntity<ResponseModel> fetchBannersByPageName(@RequestParam(value = "pageName", required = true) String pageName) {
	
	if (logger.isInfoEnabled()) {
		logger.info("fetchRating -- START");
	}
	
	ResponseModel responseModel = new ResponseModel();
	Util.printLog(pageName, BannerConstant.INCOMING, "Fetch Banner by Page Name", request);
	try {
		
		
		List<BannerModel> bannerModels = bannerService.fetchBannersByPageName(pageName);
		responseModel.setResponseBody(bannerModels);
		responseModel.setResponseCode(messageUtil.getBundle(BannerConstant.COMMON_SUCCESS_CODE));
		responseModel.setResponseMessage(messageUtil.getBundle(BannerConstant.COMMON_SUCCESS_MESSAGE));
	} catch (Exception e) {
		if (logger.isInfoEnabled()) {
			logger.info("Exception in Fetch Banner -- "+Util.errorToString(e));
		}
		responseModel.setResponseCode(messageUtil.getBundle(BannerConstant.COMMON_ERROR_CODE));
		responseModel.setResponseMessage(messageUtil.getBundle(BannerConstant.COMMON_ERROR_MESSAGE));
	}
	
	Util.printLog(responseModel, BannerConstant.OUTGOING, "Fetch Banner", request);

	if (logger.isInfoEnabled()) {
		logger.info("fetchBanners -- END");
	}
	
	if (responseModel.getResponseCode().equals(messageUtil.getBundle(BannerConstant.COMMON_SUCCESS_CODE))) {
		return new ResponseEntity<>(responseModel, HttpStatus.OK);
	} else {
		return new ResponseEntity<>(responseModel, HttpStatus.BAD_REQUEST);
	}
	
	}
}