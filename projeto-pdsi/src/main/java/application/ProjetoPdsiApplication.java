package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = { "projeto-pdsi.model" })
@EnableJpaRepositories(basePackages = { "projeto-pdsi.repository" })
@ComponentScan(basePackages = {"projeto-pdsi.controller"})
@SpringBootApplication
public class ProjetoPdsiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPdsiApplication.class, args);
	}
	
}
