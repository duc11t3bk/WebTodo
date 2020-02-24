package WebTodo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import WebTodo.User.User;
import WebTodo.User.UserRepository;

@SpringBootApplication
public class WebTodoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WebTodoApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setUsername("minhduc");
		user.setPassword(passwordEncoder.encode("minhduc123"));
		userRepository.save(user);
		System.out.println(user);
	}

		
}
