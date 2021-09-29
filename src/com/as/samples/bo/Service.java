package com.as.samples.bo;


import org.json.simple.parser.ParseException;

import com.as.samples.controller.RestClient;
import com.as.samples.vo.Request;

public class Service {



	public Double convert (Request request) throws ParseException {
		
		RestClient restClient = new RestClient();
		Double response = restClient.convertRate(request);
		return response;
	}
}
