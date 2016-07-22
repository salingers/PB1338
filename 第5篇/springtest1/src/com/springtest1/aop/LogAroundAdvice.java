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
		//���o�Q�I�s����k�W
		String targetMethodName=invocation.getMethod().getName();
		//��Ӯ榡�r��
		String logInfoText="��¶���|�G"+targetMethodName+"��k�I�s�e�ɶ�"+beginTime+"�@��,"+
		"�I�s��ɶ�"+endTime+"�@��";
		//�N��ӰT���g�J�պA���ɮפ�
		logger.info(logInfoText);
		return null;
	}

}
