package com.crudoperation;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepo userrepo;
	
	public List<User> viewHome() {
		return userrepo.findAll();
	}
	
	public User saveUser(User user) {
		return userrepo.save(user);
	}
	
	public User getUser(Integer id) {
		return userrepo.findById(id).get();
	}
	
	public void deleteUser(Integer id) {
		userrepo.deleteById(id);
	}

}
