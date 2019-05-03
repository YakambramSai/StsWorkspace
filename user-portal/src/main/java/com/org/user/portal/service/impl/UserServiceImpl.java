package com.org.user.portal.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.user.portal.dao.UserRepository;
import com.org.user.portal.entity.User;
import com.org.user.portal.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
    private UserRepository repository;

    @Override
    public void create(User user) {
         repository.save(user);
    }

    @Override
    public User delete(int id) {
        User user = repository.getOne(id);
        if(user != null){
            repository.delete(user);
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<User> findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void update(User user) {
         repository.save(user);
    }
}
