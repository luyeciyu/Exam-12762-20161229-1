package com.yws.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.yws.event.AfterInsertFilmEvent;
import com.yws.event.BeforeInsertFilmEvent;

@Component("filmInsertAop")
public class FilmInsertAop {
	
	@Autowired
	private ApplicationEventPublisher publisher;

	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		publisher.publishEvent(new BeforeInsertFilmEvent("BeforeInsertFilmEvent"));  //插入前发布事件
		Object o = pjp.proceed();
		publisher.publishEvent(new AfterInsertFilmEvent("AfterInsertFilmEvent"));    //插入后发布事件
		return o;
	}
	
}
