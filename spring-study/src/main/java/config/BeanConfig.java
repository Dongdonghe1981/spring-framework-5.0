package config;


import bean.Person;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	public Person person(){
		return new Person();
	}
}
