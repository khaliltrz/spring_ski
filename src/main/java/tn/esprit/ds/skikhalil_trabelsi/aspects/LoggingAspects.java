package tn.esprit.ds.skikhalil_trabelsi.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspects {

    @Before("execution(public * tn.esprit.ds.skikhalil_trabelsi.services..*.*(..))")
    public void inMethod(JoinPoint joinPoint){
        log.info("in method"+ joinPoint.getSignature().getName());

    }

    @AfterReturning("execution(public * tn.esprit.ds.skikhalil_trabelsi.services..*.*(..))")
    public void outMethod(JoinPoint joinPoint){
        log.info("out method"+ joinPoint.getSignature().getName());

    }

}
