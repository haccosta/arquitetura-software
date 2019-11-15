package com.pucminas.dropshipping.lojavirtual;

import com.pucminas.dropshipping.lojavirtual.domain.SequenceId;
import com.pucminas.dropshipping.lojavirtual.repository.SequenceRepository;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableRabbit
@ComponentScan(basePackages = "com.pucminas.dropshipping.lojavirtual")
@EnableDiscoveryClient
@SpringBootApplication
@EnableJpaAuditing
@EnableCaching
@EnableSwagger2
public class DropshippingLojaVirtualApplication implements CommandLineRunner {

	@Autowired
	SequenceRepository sequenceRepository;


	public static void main(String[] args) {
		SpringApplication.run(DropshippingLojaVirtualApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		sequenceRepository.deleteAll();

		sequenceRepository.save(new SequenceId("hosting", 1));

		System.out.println("Validando a sequencia criada:");
		System.out.println("-------------------------------");
		for (SequenceId sequenceId : sequenceRepository.findAll()) {
			System.out.println(sequenceId);
		}
	}


}