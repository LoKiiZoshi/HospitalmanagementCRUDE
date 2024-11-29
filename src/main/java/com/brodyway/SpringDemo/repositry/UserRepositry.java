package com.brodyway.SpringDemo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brodyway.SpringDemo.model.User;

public interface UserRepositry extends JpaRepository<User, Integer> {

	User findByUsernameAndPassword(String un, String psw);

}
