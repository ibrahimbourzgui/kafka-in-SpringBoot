package com.ibrahim.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ibrahim.springboot.kafka.WikimediaChangesProducer;

@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProducerApplication.class);
	}
	@Autowired
	private WikimediaChangesProducer changesProducer;
	@Override
	public void run(String... args) throws Exception {
		changesProducer.sendMessage();
	}
}
