package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.GoogleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		SpringApplication.run(Application.class, args);
    }

}
