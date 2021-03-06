package com.yws.pojo;

import java.util.Date;

public class Language {
	private Integer id;
	private String name;
	private Date lastUpdate;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	@Override
	public String toString() {
		return "Language [id=" + id + ", name=" + name + ", lastUpdate=" + lastUpdate + "]";
	}
	
	
}
