package mySelf.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class ValidationAspect {
    private static final Logger LOGGER = Logger.getLogger(ValidationAspect.class.getName());

    @Around("execution(* mySelf.aop.ContactsService.getContact(..)) && args(id)")
    public Object validateAndUpdate(ProceedingJoinPoint joinPoint, Long id) throws Throwable {
        if (id < 0) {
            LOGGER.info("Invalid id: " + id);
            id = -id;
            LOGGER.info("new value " + id);
        }
        Object result = joinPoint.proceed(new Object[]{id});
        return result;
    }

}
