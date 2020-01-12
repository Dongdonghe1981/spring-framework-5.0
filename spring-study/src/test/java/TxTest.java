import aop.MathCalculator;
import config.MainConfigOfAOP;
import config.TxConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tx.UserService;

public class TxTest {

	@Test
	public void test(){
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(TxConfig.class);
		UserService service =  (UserService) context.getBean(UserService.class);
		service.insertUser();
	}
}
