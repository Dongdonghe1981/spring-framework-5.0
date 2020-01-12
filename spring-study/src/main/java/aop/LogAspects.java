package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class LogAspects {

    //抽取公共的切入点表达式
    //1、本类引用
    //2、其他的切面引用
    @Pointcut("execution(public int aop.MathCalculator.*(..))")
    public void pointCut(){}
    //@Before("public int aop.MathCalculator.div(int,int)")
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint){
        System.out.println("div started");
        System.out.println(joinPoint.getSignature().getName());
        System.out.println(Arrays.asList(joinPoint.getArgs()));
    }

    @After("aop.LogAspects.pointCut()")
    public void logEnd(){
        System.out.println("div end");
    }

    @AfterReturning(value="pointCut()",returning = "result")
    public void logReturn(Object result){
        System.out.println("div return is "+result);
    }

    @AfterThrowing(value = "pointCut()",throwing = "e")
    public void logException(Exception e){
        System.out.println("div exception");
    }
}
