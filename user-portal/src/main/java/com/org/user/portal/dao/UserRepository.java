package com.org.user.portal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.user.portal.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {


}
