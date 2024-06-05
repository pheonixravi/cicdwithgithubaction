package in.ravi.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdDemo1Application {
	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to Github CICD Pipeline";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdDemo1Application.class, args);
	}

}
