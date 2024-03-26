package com.ohgiraffers.section01.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;

@Aspect
@Component
public class LoggingAspect {
//    @Pointcut:여러 조인 포인트를 매치하기위해 지정표현식
    @Pointcut("execution(* com.ohgiraffers.section01.aop.*Service.*(..))")
    public void LogPointcut(){}
//    JoinPoint:포인트 컷으로 패치한 실행시점 이렇게 매치된 조인포인트에서 해야할일이 어드바이스
//    매개변수로 전달한 JoinPoint객체는 현재 조인포인트의 메소드명 인수값등의 정보를 엑세스가능
    @Before("LoggingAspect.LogPointcut()")
    public  void logBefore(JoinPoint joinPoint){
        System.out.println("Before joinPoint.getTarget():"+joinPoint.getTarget());
        System.out.println("Before joinPoint.getSignature():"+joinPoint.getSignature());
        if (joinPoint.getArgs().length>0){
            System.out.println("Be joinPoint.getarg"+joinPoint.getArgs()[0]);
        }
    }
//    포인트컷을 동일한 클래스내에서 사용하는 것이라면 클래스명은 생략가능하다 단 패키지가 다르면 패키지명까지 포함해야한다
    @After("LogPointcut()")
    public  void logAfter(JoinPoint joinPoint){
        System.out.println("After joinPoint.getTarget():"+joinPoint.getTarget());
        System.out.println("After joinPoint.getSignature():"+joinPoint.getSignature());
        if (joinPoint.getArgs().length>0){
            System.out.println("Af joinPoint.getArg"+joinPoint.getArgs()[0]);
        }
    }
    @AfterReturning(pointcut = "LogPointcut()",returning = "result")
    public void logafterRetuning(JoinPoint joinPoint,Object result){
        System.out.println("After Returning result"+result);
        if (result != null&&result instanceof Map){
//            리턴할 결과값의 변경
            ((Map<Long,MemberDTO>)result).put(100L,new MemberDTO(100L,"리턴값 가공"));
        }
    }
//    속성의 이름과 매개변구의 이름이 동일해야한다
    @AfterThrowing(pointcut = "LogPointcut()",throwing = "exception")
    public  void logAfterTrowing(Throwable exception){
        System.out.println("af trow execp"+exception);

    }
    @Around("LogPointcut()")
    public Object logAround(ProceedingJoinPoint joinPoint)throws Throwable{
        System.out.println("A before"+joinPoint.getSignature().getName());
//        원본 조인포인트를 실행
        Object result=joinPoint.proceed();
        System.out.println("A after"+joinPoint.getSignature().getName());
//        원본 조인포인트를 호출한쪽 혹은 다른 어드바이스가 다시 실행할수있도록 반환
        return result;
    }

}
