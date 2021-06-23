package com.crm.optimus.merchaindise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/merchaindises")
public class MerchandiseController {

	private final MerchandiseService merchandiseService;
	
	@Autowired
	public MerchandiseController(MerchandiseService merchandiseService) {
		this.merchandiseService = merchandiseService;
	}
	
	@GetMapping
	public List<Merchandise> getMerchandises() {
	   return merchandiseService.getMerchandises();
	}
}
