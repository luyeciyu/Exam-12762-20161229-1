package com.yws.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.yws.event.BeforeInsertFilmEvent;

@Component
public class BeforeInsertFilmEventListener implements ApplicationListener<BeforeInsertFilmEvent>{

	@Override
	public void onApplicationEvent(BeforeInsertFilmEvent event) {
		System.out.println("Before Insert Film Data.");
	}

}
