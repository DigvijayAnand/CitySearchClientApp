package com.hsbc.interview.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.hsbc.interview.jsonmodel.Data;
import com.hsbc.interview.service.GetAPIDetailService;


/**
 * Service implementation class to filter data
 * @author digvijayanand
 *
 */
@Service
public class GetApiDetailsServiceImpl implements GetAPIDetailService {

	
	@Override
	public List<String> getAllCityStartWithLetter(Data citDataDetails,String letter) {
		
		List<String> filterCityList=new ArrayList<>();
		List<com.hsbc.interview.jsonmodel.List> cityNameList=citDataDetails.getList().stream().filter(cityName->cityName.getName().startsWith(letter)||cityName.getName().startsWith(letter.toUpperCase())).collect(Collectors.toList());
		if(cityNameList!=null) {
			cityNameList.forEach(item->{filterCityList.add(item.getName());});
			return filterCityList;
		}  
		
		return null;
		
	}

	

	
	

}
