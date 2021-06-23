package com.crm.optimus.merchaindise;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MerchandiseConfig {

	@Bean
	CommandLineRunner commandLineRunner(MerchandiseRepo repo) {
		
		return args->{
			 Merchandise HP = new Merchandise( "hp", LocalDate.now(), 49000, "vishnu");
			 Merchandise Dell = new Merchandise( "Dell", LocalDate.now(), 55000, "vishnu");
			 Merchandise Apple = new Merchandise( "Apple", LocalDate.now(), 149000, "vishnu");
			 
			 repo.saveAll(List.of(HP,Dell,Apple));
		};
	}
	
}
