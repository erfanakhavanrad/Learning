package mySelf.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger logger = Logger.getLogger(LoggingAspect.class.getName());


    @Before("within(@org.springframework.stereotype.Service *)")
    public void logMethodCall(JoinPoint joinPoint) {
        logger.info("Before method name: " + joinPoint.getSignature().getName() + joinPoint.getKind());
    }

    @After("within(@org.springframework.stereotype.Service *)")
    public void logMethodExecuted(JoinPoint joinPoint) {
        logger.info("After method name: " + joinPoint.getSignature().getName() + joinPoint.getKind());
    }

    @AfterThrowing("within(@org.springframework.stereotype.Service *)")
    public void logMethodError(JoinPoint joinPoint) {
        logger.info("Error method name: " + joinPoint.getSignature().getName() + joinPoint.getKind());
    }

    @AfterReturning("within(@org.springframework.stereotype.Service *)")
    public void logMethodReturn(JoinPoint joinPoint) {
        logger.info("After Return method name: " + joinPoint.getSignature().getName() + joinPoint.getKind());
    }


}