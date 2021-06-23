package com.crm.optimus.merchaindise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchandiseRepo extends JpaRepository<Merchandise, Long>{
     
	
}
