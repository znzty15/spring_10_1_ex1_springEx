package com.javaGG.ex;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {

	@Pointcut("within(com.javaGG.ex.*)")
	private void pointcutMethod() {
		
	}
	
	@Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint jointpoint) throws Throwable { 
		// around 대상 객체의 메소드가 실행 전,후 또는 익셉션 발생시점에서 공통기능 실행
		
		String signatureStr = jointpoint.getSignature().toShortString();
		System.out.println(signatureStr + "메서드가 시작 되었습니다!");
		long st = System.currentTimeMillis();
				
		try {
			Object obj = jointpoint.proceed();
			return obj;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + "메서드가 종료 되었습니다!");
			System.out.println(signatureStr + "경과시간 : " + (et-st));
		}
	}
	
	@Before("within(com.javaGG.ex.*)")
	public void beforeAdvice(JoinPoint joinPoint) { //before 대상 객체의 메소드 호출 전에 공통기능 실행
		System.out.println("before Advice가 실행됨");
	}
	
}