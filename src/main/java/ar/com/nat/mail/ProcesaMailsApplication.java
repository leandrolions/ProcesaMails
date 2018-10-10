package ar.com.nat.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration
public class ProcesaMailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcesaMailsApplication.class, args);
	}
}
