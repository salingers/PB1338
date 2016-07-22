package com.springtest1.aop;

import org.apache.log4j.Logger;
import java.lang.reflect.Method;
import org.springframework.aop.*;

public class ThrowsLogAdvice implements ThrowsAdvice {
	private Logger logger=Logger.getLogger(LogAdvice.class);
    public void afterThrowing(Method method, Object[] args, Object target, Throwable exeptionClass){
    	//���o�Q�I�s�����O�W
		String targetClassName=target.getClass().getName();
		//���o�Q�I�s����k�W
		String targetMethodName=method.getName();
		//��Ӯ榡�r��
		String logInfoText="�ҥ~���|�G����"+targetClassName+"���O��"+targetMethodName+"��k�ɵo�ͨҥ~";
		//�N��ӰT���g�J�պA���ɮפ�
		logger.info(logInfoText);
    }

}
