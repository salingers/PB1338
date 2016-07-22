package com.springtest1.aop;

import org.apache.log4j.Logger;
import java.lang.reflect.Method;
import org.springframework.aop.*;

public class ThrowsLogAdvice implements ThrowsAdvice {
	private Logger logger=Logger.getLogger(LogAdvice.class);
    public void afterThrowing(Method method, Object[] args, Object target, Throwable exeptionClass){
    	//取得被呼叫的類別名
		String targetClassName=target.getClass().getName();
		//取得被呼叫的方法名
		String targetMethodName=method.getName();
		//日志格式字串
		String logInfoText="例外知會：執行"+targetClassName+"類別的"+targetMethodName+"方法時發生例外";
		//將日志訊息寫入組態的檔案中
		logger.info(logInfoText);
    }

}
