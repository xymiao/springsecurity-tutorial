package com.xymiao.springsecurity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class C03SpringSecurityJdbcApplicationTests {

	@Autowired
	UserDetailsManager userDetailsManager;

	@Test
	void createUser()  {
		Set<GrantedAuthority> authorities = new HashSet<>();
		authorities.add(new SimpleGrantedAuthority("user"));
		String password = new BCryptPasswordEncoder().encode("user");
		UserDetails userDetails = new User("user", password, authorities);
		userDetailsManager.createUser(userDetails);
	}

}
