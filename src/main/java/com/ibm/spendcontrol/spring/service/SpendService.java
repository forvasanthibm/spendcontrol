package com.ibm.spendcontrol.spring.service;

import java.util.List;

import com.ibm.spendcontrol.spring.bean.Spend;



public interface SpendService {
	public void createSpend(Spend spend);
	
	public List<Spend> getSpend();
	//public User findById(String id);
	public Spend updateSpend(Spend spend, String l);
	//public void deleteUserById(String id);
	//public User updatePartially(User user, String id);
}
