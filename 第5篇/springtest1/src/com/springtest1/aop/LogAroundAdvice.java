package com.springtest1.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

public class LogAroundAdvice implements MethodInterceptor {

	private Logger logger=Logger.getLogger(LogAdvice.class);
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long beginTime=System.currentTimeMillis();
		invocation.proceed();
		long endTime=System.currentTimeMillis();
		//取得被呼叫的方法名
		String targetMethodName=invocation.getMethod().getName();
		//日志格式字串
		String logInfoText="環繞知會："+targetMethodName+"方法呼叫前時間"+beginTime+"毫秒,"+
		"呼叫後時間"+endTime+"毫秒";
		//將日志訊息寫入組態的檔案中
		logger.info(logInfoText);
		return null;
	}

}
