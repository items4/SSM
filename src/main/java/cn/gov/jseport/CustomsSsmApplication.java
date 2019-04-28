package cn.gov.jseport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.gov.jseport.mapper")
public class CustomsSsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomsSsmApplication.class, args);
	}

}
