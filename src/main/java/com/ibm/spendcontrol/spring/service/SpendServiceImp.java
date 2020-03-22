package com.ibm.spendcontrol.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.spendcontrol.spring.bean.Spend;
import com.ibm.spendcontrol.spring.repository.SpendRepository;

@Service
@Transactional
public class SpendServiceImp implements SpendService {
	@Autowired
	SpendRepository spendRepository;
	
	
	public void createSpend(Spend spend) {
		// TODO Auto-generated method stub
		spendRepository.save(spend);
	}
	
	
	public List<Spend> getSpend() {
		// TODO Auto-generated method stub
		return (List<Spend>)spendRepository.findAll();
	}
	
	/*
	 * public Optional<User> findById(String id) { // TODO Auto-generated method
	 * stub return userRepository.findById(id);
	 * 
	 * }
	 */
	
	
	public Spend updateSpend(Spend spend, String l) {
		// TODO Auto-generated method stub
		return spendRepository.save(spend);
	}

	/*
	 * public void deleteUserById(String id) { // TODO Auto-generated method stub
	 * userRepository.delete(id); }
	 */
	/*
	 * public User updatePartially(User user, String id) { // TODO Auto-generated
	 * method stub User usr = findById(id); usr.setCountry(user.getCountry());
	 * return userRepository.save(usr); }
	 */



}
