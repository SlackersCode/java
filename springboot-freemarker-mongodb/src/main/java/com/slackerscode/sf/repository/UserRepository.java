package com.slackerscode.sf.repository;

import org.springframework.data.repository.CrudRepository;

import com.slackerscode.sf.model.User;

public interface UserRepository extends CrudRepository<User, String> {

}
