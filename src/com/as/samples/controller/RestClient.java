package com.as.samples.controller;



import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.as.samples.vo.Request;

public class RestClient {

	public Double convertRate(Request request) throws ParseException { 
		
		String response = convertRateApiCall();
		
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = (JSONObject) parser.parse(response);
		
		Double amount = request.getAmount();
		String sourse = request.getSource();
		String target = request.getTarget();
		
		JSONObject rates = (JSONObject) jsonObj.get("rates");
		
		Double sourceAmount = (Double) rates.get(sourse);
		Double targetAmount = (Double) rates.get(target);
		System.out.println("sourceAmount"+sourceAmount);
		System.out.println("targetAmount"+targetAmount);
		
		Double source_EUR = amount /sourceAmount;
		
		Double result = source_EUR*targetAmount;
		
	
		return result;
		
	}


	
	public static String convertRateApiCall() {
		RestTemplate restTemplate = new RestTemplate();
		String url ="http://api.exchangeratesapi.io/v1/latest?access_key=a65b928dbd8b58aaf64a55fdcc0a28d8";
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		
		return response.getBody();
		
	}
	public static void main(String[] args) {
		System.out.println(convertRateApiCall());
	}
}
