package guru.springframework;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class Spring5RecipeAppApplication {

	public static void main(String[] args) {
            
		SpringApplication.run(Spring5RecipeAppApplication.class, args);
	}
}
