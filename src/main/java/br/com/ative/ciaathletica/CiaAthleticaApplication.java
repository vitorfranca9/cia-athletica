package br.com.ative.ciaathletica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import br.com.ative.ciaathletica.dao.EntityDAO;

@SpringBootApplication
//@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
@Configuration
@EntityScan//(basePackageClasses=IEntity.class)
@EnableWebMvc
public class CiaAthleticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiaAthleticaApplication.class, args);
	}
	
//	@Bean
//	public EntityDAO entityDAO() {
//		return new EntityDAO();
//	}
}
