package com.springtest1.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;
import org.apache.log4j.Logger;

public class LogAdvice implements MethodBeforeAdvice {

	private Logger logger=Logger.getLogger(LogAdvice.class);
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		//���o�Q�I�s�����O�W
		String targetClassName=target.getClass().getName();
		//���o�Q�I�s����k�W
		String targetMethodName=method.getName();
		//��Ӯ榡�r��
		String logInfoText="�e�m���|�G"+targetClassName+"���O��"+targetMethodName+"��k�}�l����";
		//�N��ӰT���g�J�պA���ɮפ�
		logger.info(logInfoText);
	}
}
