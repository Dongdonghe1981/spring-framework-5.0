import bean.Person;
import config.BeanConfig;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		context.publishEvent(new ApplicationEvent(new String("My publish Event")) {
			@Override
			public Object getSource() {
				return super.getSource();
			}
		});
		for(String name : context.getBeanDefinitionNames()){
			System.out.println(name);
		}

	}
}
