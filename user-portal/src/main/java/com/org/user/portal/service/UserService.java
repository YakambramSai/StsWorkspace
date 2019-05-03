package com.org.user.portal.service;

import java.util.List;
import java.util.Optional;

import com.org.user.portal.entity.User;

public interface UserService {

	public void create(User user);

	public Optional<User> findById(int id);

	public void update(User user);

	public User delete(int id);

	public List<User> findAll();

	

}
