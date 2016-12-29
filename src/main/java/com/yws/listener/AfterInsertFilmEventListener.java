package com.yws.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.yws.event.AfterInsertFilmEvent;

@Component
public class AfterInsertFilmEventListener implements ApplicationListener<AfterInsertFilmEvent>{

	@Override
	public void onApplicationEvent(AfterInsertFilmEvent event) {
		System.out.println("After Insert Film Data.");
	}

}
