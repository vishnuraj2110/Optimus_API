package com.crm.optimus.merchaindise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchandiseService {
    private final MerchandiseRepo merchandiserepo;
    
    @Autowired
	public MerchandiseService(MerchandiseRepo merchandiserepo) {
	     this.merchandiserepo = merchandiserepo;
	}

	public List<Merchandise> getMerchandises() {
		return merchandiserepo.findAll();
	}
}
