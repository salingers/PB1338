package com.springtest1.aop;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class AfterLogAdvice implements AfterReturningAdvice {

	private Logger logger=Logger.getLogger(LogAdvice.class);
	public void afterReturning(Object returnValue, Method method, Object[] args,
			Object target) throws Throwable {
		//���o�Q�I�s�����O�W
		String targetClassName=target.getClass().getName();
		//���o�Q�I�s����k�W
		String targetMethodName=method.getName();
		//��Ӯ榡�r��
		String logInfoText="��m���|�G"+targetClassName+"���O��"+targetMethodName+"��k�w�g����";
		//�N��ӰT���g�J�պA���ɮפ�
		logger.info(logInfoText);
	}

}
