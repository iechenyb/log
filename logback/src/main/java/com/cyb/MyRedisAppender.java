package com.cyb;

import com.cwbase.logback.RedisAppender;

import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 *作者 : iechenyb<br>
 *类描述: 说点啥<br>
 *创建时间: 2017年11月28日
 */
public class MyRedisAppender extends RedisAppender{

	@Override
	protected void append(ILoggingEvent event) {
		super.append(event);
	}
	
}
