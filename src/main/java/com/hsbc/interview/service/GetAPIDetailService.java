package com.hsbc.interview.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hsbc.interview.jsonmodel.Data;

/**
 * Service interface for getting city data details
 * @author digvijayanand
 *
 */

@Service
public interface  GetAPIDetailService {
	
	/**
	 * Service method to filter city based on Alphabet
	 * @param citDetailData
	 * @param letter
	 * @return List<String>
	 */
	public List<String> getAllCityStartWithLetter(Data citDetailData,String letter);

}
