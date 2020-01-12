import config.TxConfig;
import ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tx.UserService;

public class ExtTest {

	@Test
	public void test(){
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ExtConfig.class);
	}
}
