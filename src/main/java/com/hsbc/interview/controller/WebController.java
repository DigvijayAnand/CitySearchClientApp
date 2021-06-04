package com.hsbc.interview.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.hsbc.interview.jsonmodel.Data;
import com.hsbc.interview.model.InputDetail;
import com.hsbc.interview.service.GetAPIDetailService;

/**
 * Web controller class to handle http request
 * @author digvijayanand
 *
 */
@Controller
@PropertySource("classpath:application.properties")
public class WebController {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	GetAPIDetailService getAPIDetailService;

	

	@Value("${city.list.api.url}")
	private String url;
	
	
	@Value("${empty.error.msg}")
	private String emptyMsg;
	
	@Value("${not.found.error.msg}")
	private String errorMsg;

	@GetMapping("/home")
	public String getHomePageView(Model model) {

		model.addAttribute("inputDetail", new InputDetail());

		return "home";
	}

	/**
	 * Search city by alphabet and populate result to html view
	 * @param model
	 * @param inputDetail
	 * @return String html file name
	 */
	@PostMapping(value = "/home")
	public String searchAllCityByAlphabet(Model model, @ModelAttribute InputDetail inputDetail) {
		
		model.addAttribute("inputDetail", inputDetail);
		
		if(inputDetail.getAlphabet().isEmpty()) {
			model.addAttribute("empty", emptyMsg);
		}else {
			List<String> cityList = getAllCityDetails(inputDetail.getAlphabet());
			if (cityList.size() > 0) {
				model.addAttribute("cityNameList", cityList);
			} else {

				model.addAttribute("error", errorMsg +" "+"'"+ inputDetail.getAlphabet()+"'");
			}
		}
		
		
		return "home";
	}
	
	
	/**
	 * Rest API call to get JSON data and convert to Data bean object 
	 * @param letter
	 * @return List of city
	 */
	private List<String> getAllCityDetails(String letter) {
		
		Data citiesData = restTemplate.getForObject(url, Data.class);
		return getAPIDetailService.getAllCityStartWithLetter(citiesData, letter);

	}

}
