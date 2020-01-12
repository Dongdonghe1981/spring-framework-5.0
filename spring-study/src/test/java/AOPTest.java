import aop.MathCalculator;
import config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
        MathCalculator calculator =  (MathCalculator) context.getBean(MathCalculator.class);
        calculator.div(1,1);
    }
}
