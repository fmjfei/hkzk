package cc.au.hkzk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cc.au.hkzk.mapper")
public class HkzkApplication {

	public static void main(String[] args) {
		SpringApplication.run(HkzkApplication.class, args);
	}

}
