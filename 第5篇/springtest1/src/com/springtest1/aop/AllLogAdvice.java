package com.springtest1.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AllLogAdvice {
	private Logger logger=Logger.getLogger(AllLogAdvice.class);
	//此方法將作為前置知會
	public void myBeforeAdvice(JoinPoint jionpoint){
		//取得被呼叫的類別名
		String targetClassName=jionpoint.getTarget().getClass().getName();
		//取得被呼叫的方法名
		String targetMethodName=jionpoint.getSignature().getName();
		//日志格式字串
		String logInfoText="前置知會："+targetClassName+"類別的"+targetMethodName+"方法開始執行";
		//將日志訊息寫入組態的檔案中
		logger.info(logInfoText);
	}
	
	//此方法將作為後置知會
	public void myAfterReturnAdvice(JoinPoint jionpoint){
		//取得被呼叫的類別名
		String targetClassName=jionpoint.getTarget().getClass().getName();
		//取得被呼叫的方法名
		String targetMethodName=jionpoint.getSignature().getName();
		//日志格式字串
		String logInfoText="後置知會："+targetClassName+"類別的"+targetMethodName+"方法開始執行";
		//將日志訊息寫入組態的檔案中
		logger.info(logInfoText);
	}
	
	//此方法將作為例外知會
	public void myThrowingAdvice(JoinPoint jionpoint,Exception e){
		//取得被呼叫的類別名
		String targetClassName=jionpoint.getTarget().getClass().getName();
		//取得被呼叫的方法名
		String targetMethodName=jionpoint.getSignature().getName();
		//日志格式字串
		String logInfoText="例外知會：執行"+targetClassName+"類別的"+targetMethodName+"方法時發生例外";
		//將日志訊息寫入組態的檔案中
		logger.info(logInfoText);
	}
	
	//此方法將作為環繞知會
	public void myAroundAdvice(ProceedingJoinPoint jionpoint) throws Throwable{
		long beginTime=System.currentTimeMillis();
		jionpoint.proceed();		
		long endTime=System.currentTimeMillis();
		//取得被呼叫的方法名
		String targetMethodName=jionpoint.getSignature().getName();
		//日志格式字串
		String logInfoText="環繞知會："+targetMethodName+"方法呼叫前時間"+beginTime+"毫秒,"+
		"呼叫後時間"+endTime+"毫秒";
		//將日志訊息寫入組態的檔案中
		logger.info(logInfoText);
	}

}
