package com.example.dataktp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class data_ktpController {

	@Autowired
	private data_ktpService service;
	
	
	
	public data_ktpController(data_ktpService service) {
		super();
		this.service = service;
	}



	@GetMapping("/dataktp")
	public String listKtp(Model model){
		model.addAttribute("dataktp", service.getAllKtp());
		return "dataktp";
		
	}

}
