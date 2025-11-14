package Devops_Demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DevopsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsDemoApplication.class, args);
	}
	
	@GetMapping("/")
	public String welcome() {
		return "<h1>DEVOPS DEMO PROJECT</h1>";
	}
	
	@GetMapping("/about")
	public String about() {
		return "<h2>The project enables you to apply key concepts learned in this course through a practical,"
				+ " end-to-end implementation. "
				+ "You can email your solution to our support team within a week of course completion."
				+ " Edureka will review the submission and award the certificate based on performance-based grading.</h2>";
	}

}
