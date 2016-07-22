package com.springtest1.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AllLogAdvice {
	private Logger logger=Logger.getLogger(AllLogAdvice.class);
	//����k�N�@���e�m���|
	public void myBeforeAdvice(JoinPoint jionpoint){
		//���o�Q�I�s�����O�W
		String targetClassName=jionpoint.getTarget().getClass().getName();
		//���o�Q�I�s����k�W
		String targetMethodName=jionpoint.getSignature().getName();
		//��Ӯ榡�r��
		String logInfoText="�e�m���|�G"+targetClassName+"���O��"+targetMethodName+"��k�}�l����";
		//�N��ӰT���g�J�պA���ɮפ�
		logger.info(logInfoText);
	}
	
	//����k�N�@����m���|
	public void myAfterReturnAdvice(JoinPoint jionpoint){
		//���o�Q�I�s�����O�W
		String targetClassName=jionpoint.getTarget().getClass().getName();
		//���o�Q�I�s����k�W
		String targetMethodName=jionpoint.getSignature().getName();
		//��Ӯ榡�r��
		String logInfoText="��m���|�G"+targetClassName+"���O��"+targetMethodName+"��k�}�l����";
		//�N��ӰT���g�J�պA���ɮפ�
		logger.info(logInfoText);
	}
	
	//����k�N�@���ҥ~���|
	public void myThrowingAdvice(JoinPoint jionpoint,Exception e){
		//���o�Q�I�s�����O�W
		String targetClassName=jionpoint.getTarget().getClass().getName();
		//���o�Q�I�s����k�W
		String targetMethodName=jionpoint.getSignature().getName();
		//��Ӯ榡�r��
		String logInfoText="�ҥ~���|�G����"+targetClassName+"���O��"+targetMethodName+"��k�ɵo�ͨҥ~";
		//�N��ӰT���g�J�պA���ɮפ�
		logger.info(logInfoText);
	}
	
	//����k�N�@����¶���|
	public void myAroundAdvice(ProceedingJoinPoint jionpoint) throws Throwable{
		long beginTime=System.currentTimeMillis();
		jionpoint.proceed();		
		long endTime=System.currentTimeMillis();
		//���o�Q�I�s����k�W
		String targetMethodName=jionpoint.getSignature().getName();
		//��Ӯ榡�r��
		String logInfoText="��¶���|�G"+targetMethodName+"��k�I�s�e�ɶ�"+beginTime+"�@��,"+
		"�I�s��ɶ�"+endTime+"�@��";
		//�N��ӰT���g�J�պA���ɮפ�
		logger.info(logInfoText);
	}

}
