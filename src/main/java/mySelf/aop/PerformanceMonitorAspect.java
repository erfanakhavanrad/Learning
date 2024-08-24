package mySelf.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class PerformanceMonitorAspect {

    private static final Logger LOGGER = Logger.getLogger(PerformanceMonitorAspect.class.getName());

    @Around("execution(* mySelf.aop.ContactsService.getContacts(..))")
    public Object monitorTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long endTime = System.currentTimeMillis();
        LOGGER.info("Time taken: " + (endTime - startTime) + "ms");
        return result;
    }


}
