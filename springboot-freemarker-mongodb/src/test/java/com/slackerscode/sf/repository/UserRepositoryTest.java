package com.slackerscode.sf.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.google.common.collect.Iterables;
import com.slackerscode.sf.Application;
import com.slackerscode.sf.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class UserRepositoryTest {

	@Autowired
	UserRepository userRepository;

	@Test
	public void testCRUDMethods() {

		User user = new User("test", "test");
		Assert.notNull(userRepository.save(user), "Problem saving");
		Assert.notNull(userRepository.findAll(), "Problem retrieving");
		Assert.isTrue(Iterables.size(userRepository.findAll()) == 1, "Problem retrieving");
		user.setUsername("update test");
		Assert.notNull(userRepository.save(user), "Problem updating");
		Assert.notNull(userRepository.findOne(user.getId()), "Problem retrieving");
		Assert.isTrue("update test".equals(userRepository.findOne(user.getId()).getUsername()), "Problem updating");
		userRepository.delete(user);
		Assert.isTrue(Iterables.size(userRepository.findAll()) == 0, "Problem deleting");

	}

}
