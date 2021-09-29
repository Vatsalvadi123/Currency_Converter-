package com.as.samples.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.as.samples.bo.Service;
import com.as.samples.vo.Request;

@Controller
@SessionAttributes("person")
public class PersonalinfoController {

	
	@ModelAttribute("person")
	public Request getPerson()
	{
		return new Request();
	}

	@RequestMapping("/personalinfo.do")
	public String getPersonalInfo(@ModelAttribute Request person) {
		return "Personalinfo";
	}

	@RequestMapping("/processpinfo.do")
	public String processPersonalInfo(@ModelAttribute("person") Request person) throws Exception {

		System.out.println("personalcontroller:processPespnalInfo():start()");

//		System.out.println("User source Name:" + person.getSource());
//		System.out.println("User Amount Name:" + person.getAmount());
//		System.out.println("User Target Name:" + person.getTarget());

		Service service = new Service();
		Double response = service.convert(person);
		System.out.println(response);
		System.out.println("personalcontroller:processPespnalInfo():end()");
		person.setResult(response);
		return "quit";
		
	}
//	@PostMapping("/convert")
//	public Double convert (@RequestBody Request request) throws ParseException {
//		Service service = new Service();
//		//Double response = service.convert(person);
//		return response;
//	}
	

}
