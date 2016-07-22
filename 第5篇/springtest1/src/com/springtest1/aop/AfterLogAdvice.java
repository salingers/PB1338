package com.springtest1.aop;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class AfterLogAdvice implements AfterReturningAdvice {

	private Logger logger=Logger.getLogger(LogAdvice.class);
	public void afterReturning(Object returnValue, Method method, Object[] args,
			Object target) throws Throwable {
		//取得被呼叫的類別名
		String targetClassName=target.getClass().getName();
		//取得被呼叫的方法名
		String targetMethodName=method.getName();
		//日志格式字串
		String logInfoText="後置知會："+targetClassName+"類別的"+targetMethodName+"方法已經執行";
		//將日志訊息寫入組態的檔案中
		logger.info(logInfoText);
	}

}
