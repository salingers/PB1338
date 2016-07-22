package com.springtest1.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;
import org.apache.log4j.Logger;

public class LogAdvice implements MethodBeforeAdvice {

	private Logger logger=Logger.getLogger(LogAdvice.class);
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		//取得被呼叫的類別名
		String targetClassName=target.getClass().getName();
		//取得被呼叫的方法名
		String targetMethodName=method.getName();
		//日志格式字串
		String logInfoText="前置知會："+targetClassName+"類別的"+targetMethodName+"方法開始執行";
		//將日志訊息寫入組態的檔案中
		logger.info(logInfoText);
	}
}
