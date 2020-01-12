package ext;


import bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * BeanFactoryPostProcessor
 */
@Configuration
@ComponentScan("ext")
public class ExtConfig {

	@Bean
	public Person person(){
		return new Person();
	}
}
